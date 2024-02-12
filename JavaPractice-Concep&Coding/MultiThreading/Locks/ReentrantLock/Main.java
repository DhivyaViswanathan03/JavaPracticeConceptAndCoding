package Locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) {

		SharedResource resource1 = new SharedResource();
		SharedResource resource2 = new SharedResource();
		ReentrantLock lock=new ReentrantLock();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 calling ..");
				resource1.produce(lock);

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				resource2.produce(lock);
			}
		});

		t1.start();
		t2.start();

	}

}
