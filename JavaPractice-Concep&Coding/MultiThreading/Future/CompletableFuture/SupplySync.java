package Future.CompletableFuture;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class SupplySync {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
				new MyCustomThreadFactory2(), new MyCustomRejectionHadler2());

		CompletableFuture<String> obj = CompletableFuture.supplyAsync(new Supplier<String>() {

			@Override
			public String get() {
				return "I love Java";
			}
		}, executor);

		System.out.println(obj.get());
	}
}

class MyCustomThreadFactory2 implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(Thread.NORM_PRIORITY);
		t.setDaemon(false);
		return t;
	}

}

class MyCustomRejectionHadler2 implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println("Task Rejected.." + executor.toString());
	}

}
