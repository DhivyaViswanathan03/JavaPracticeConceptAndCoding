package Locks.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
	int a = 10;
	StampedLock lock = new StampedLock();

	public void produce() {
		System.out.println("Optimistioc read by :"+Thread.currentThread().getName());
		long stamp = lock.tryOptimisticRead();
		try {
			a=11;
			Thread.sleep(2000);
			if(lock.validate(stamp)) {
				
				System.out.println("Successfully updated");
				System.out.println("Latest a value is:"+a);
				
			}else {
				System.out.println("Rollback");
				a=10;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void consume() {
		System.out.println("Write lock acquired by:" + Thread.currentThread().getName());
		long stamp = lock.writeLock();
		System.out.println("Samp value is:"+stamp);
		try {
			System.out.println("Performing work..");
//			a = 9;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock(stamp);
			System.out.println("Write lock released by:" + Thread.currentThread().getName());
		}

	}

}
