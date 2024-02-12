package LockFreeMechanism;

public class Main {

	public static void main(String args[]) {
		SharedResource obj1 = new SharedResource();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 200; i++) {
					obj1.producer();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 200; i++) {
					obj1.producer();
				}

			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(obj1.getCount());
	}

}
