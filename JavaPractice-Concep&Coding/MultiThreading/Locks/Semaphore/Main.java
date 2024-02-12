package Locks.Semaphore;

public class Main {

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				resource.produce();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				resource.produce();

			}
		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				resource.produce();

			}
		});
		
		t1.start();
		t2.start();
		t3.start();

	}

}
