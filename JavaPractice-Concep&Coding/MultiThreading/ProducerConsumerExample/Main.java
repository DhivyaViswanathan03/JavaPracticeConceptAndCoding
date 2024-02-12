package ProducerConsumerExample;

public class Main {

	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource(2);

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 6; i++) {
					sharedResource.producer(i);
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 6; i++) {
					sharedResource.consumer();
				}
			}
		});

		t1.start();
		t2.start();
	}

}
