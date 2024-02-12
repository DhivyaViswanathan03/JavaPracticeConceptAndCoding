package Future.CompletableFuture;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ThenCombineSyncAndAsync {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
				new MyCustomThreadFactory3(), new MyCustomRejectionHadler3());

		CompletableFuture<String> obj = CompletableFuture.supplyAsync(new Supplier<String>() {

			@Override
			public String get() {
				System.out.println("obj thread is:"+Thread.currentThread().getName());
				return "I love Java";
			}
		}, executor);
		
		CompletableFuture<String> obj2 = CompletableFuture.supplyAsync(new Supplier<String>() {

			@Override
			public String get() {
				System.out.println("obj2 thread is:"+Thread.currentThread().getName());
				return " Very Much";
			}
		}, executor);
		
		CompletableFuture<String> result = obj.thenCombineAsync(obj2, new BiFunction<String,String,String>() {

			@Override
			public String apply(String t, String u) {
				System.out.println("thenCombine thread is:"+Thread.currentThread().getName());
				return t+u;
			}
		},executor);
		
		try {
			System.out.println(result.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}


	}
	}


