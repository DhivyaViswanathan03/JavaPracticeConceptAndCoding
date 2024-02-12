package Future.CompletableFuture;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class ThenAcceptSyncAndAsync {
	@SuppressWarnings({ "rawtypes", "static-access" })
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
				new MyCustomThreadFactory3(), new MyCustomRejectionHadler3());
		CompletableFuture obj=CompletableFuture.supplyAsync(new Supplier<String>() {

			@Override
			public String get() {
				System.out.println("supplyAsync thread is:"+Thread.currentThread().getName());
				return "Hello";
			}
		},executor).thenAcceptAsync((String val)->{
			System.out.println("thenCompose thread is:"+Thread.currentThread().getName());
			System.out.println("Result is:"+val);
			},executor);
		obj.get();

	}
}
