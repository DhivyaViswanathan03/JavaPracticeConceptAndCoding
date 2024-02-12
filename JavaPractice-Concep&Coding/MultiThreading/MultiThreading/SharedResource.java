package MultiThreading;

public class SharedResource {

	public void test1(SharedResource resource2) {

		synchronized (this) {
			System.out.println("Lock acquired by :" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resource2) {
				System.out.println();
			}
			System.out.println("Lock released by :" + Thread.currentThread().getName());
		}
	}

	public void test2(SharedResource resource1) {

		synchronized (this) {
			System.out.println("Lock acquired by :" + Thread.currentThread().getName());
			
			System.out.println("Task executed.");

			synchronized (resource1) {
				System.out.println();
			}

			System.out.println("Lock released by :" + Thread.currentThread().getName());
		}
	}

}
