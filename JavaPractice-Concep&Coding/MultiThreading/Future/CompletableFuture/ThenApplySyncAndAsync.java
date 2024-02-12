package Future.CompletableFuture;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

public class ThenApplySyncAndAsync {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
				new MyCustomThreadFactory3(), new MyCustomRejectionHadler3());

		CompletableFuture<String> obj = CompletableFuture.supplyAsync(new Supplier<String>() {

			@Override
			public String get() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("thread is:"+Thread.currentThread().getName());
				return "I love Java";
			}
		}, executor).thenApplyAsync(new Function<String, String>() {

			@Override
			public String apply(String input) {
				System.out.println("thenApplyAsync thread is:"+Thread.currentThread().getName());
				return input +"truely";
			}
		}, executor).thenApplyAsync((String input)->{
			System.out.println("thenApplyAsync thread is:"+Thread.currentThread().getName());
			return input+ "100%";
		}, executor);
		System.out.println(obj.get());

	}
}

class MyCustomThreadFactory3 implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(Thread.NORM_PRIORITY);
		t.setDaemon(false);
		return t;
	}

}

class MyCustomRejectionHadler3 implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println("Task Rejected.." + executor.toString());
	}

}
