package MultiThreading;

public class AvoidDeadLock {

	public void test1(AvoidDeadLock resource2) {

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

	public void test2(AvoidDeadLock resource1) {

		synchronized (resource1) {
			System.out.println("Lock acquired by :" + Thread.currentThread().getName());
			
			System.out.println("Task executed.");

			synchronized (this) {
				System.out.println();
			}

			System.out.println("Lock released by :" + Thread.currentThread().getName());
		}
	}
}
