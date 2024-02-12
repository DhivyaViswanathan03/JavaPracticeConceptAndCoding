package ShutdownAwaitTerminationShutdownNow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Task is completed");
			}
		});
		
//		executor.shutdown();
		
//		boolean isTerminated=executor.awaitTermination(2, TimeUnit.SECONDS);
//		
//		System.out.println(isTerminated);
		
		executor.shutdownNow();
		
		System.out.println("main thread is completed");

	}

}
