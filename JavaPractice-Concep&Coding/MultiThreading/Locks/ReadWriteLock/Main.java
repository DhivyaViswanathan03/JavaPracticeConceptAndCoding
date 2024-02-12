package Locks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

	public static void main(String[] args) {
		SharedResource resource1 = new SharedResource();
		SharedResource resource2 = new SharedResource();
		SharedResource resource3 = new SharedResource();

		ReadWriteLock lock = new ReentrantReadWriteLock();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				resource1.produce(lock);

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				resource2.produce(lock);

			}
		});
		
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				resource3.consume(lock);

			}
		});
		
		t1.start();
		t2.start();
		t3.start();


	}

}
