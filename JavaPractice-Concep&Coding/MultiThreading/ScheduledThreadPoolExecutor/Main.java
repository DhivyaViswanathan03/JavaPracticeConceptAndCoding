package ScheduledThreadPoolExecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
		// Runnable=> not return
//		ScheduledFuture<?> result = executor.schedule(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("hello");
//			}
//		}, 2, TimeUnit.SECONDS);

		// Callable=>Return
//		ScheduledFuture<String> result = executor.schedule(new Callable<String>() {
//
//			@Override
//			public String call() throws Exception {
//				return "hello";
//			}
//		},2,TimeUnit.SECONDS);
//		System.out.println(result.get());

		//
//		ScheduledFuture<?> obj = executor.scheduleAtFixedRate(()->{
//			
//			try {
//				System.out.println("Task started");
//				Thread.sleep(7000);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//			System.out.println("hello");
//			System.out.println("Task completed");
//		}, 2,5, TimeUnit.SECONDS);

		ScheduledFuture<?> obj = executor.scheduleWithFixedDelay(() -> {

			try {
				System.out.println("Task started");
				Thread.sleep(7000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("hello");
			System.out.println("Task completed");
		}, 2, 5, TimeUnit.SECONDS);

	}
}
