package ThreadLocalClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

		ThreadLocal<String> threadLocalObj = new ThreadLocal<String>();

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(new Runnable() {

			@Override
			public void run() {
				System.out.println("Task 1 started");
				threadLocalObj.set(Thread.currentThread().getName());
				System.out.println("Task 1 completed" + threadLocalObj.get());
				//remove threadLocalVaribale if want to reuse the thread
				threadLocalObj.remove();
			}
		});
		for(int i=0;i<10;i++) {
		executor.submit(new Runnable() {

			@Override
			public void run() {
				System.out.println("Task 1 started");
				System.out.println("Task 1 completed" + threadLocalObj.get());
			}
		});
		}

	

	}

}
