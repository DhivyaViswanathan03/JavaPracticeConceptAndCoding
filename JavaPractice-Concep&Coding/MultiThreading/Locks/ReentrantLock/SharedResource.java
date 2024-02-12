package Locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
	
	boolean isAvailable=false;
	
	public  void produce(ReentrantLock lock) {
		lock.lock();
		System.out.println("Lock Acquired by :"+Thread.currentThread().getName());
		isAvailable=true;
		try {
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Lock Released by :"+Thread.currentThread().getName());
			lock.unlock();
		}
		
		
	}

}
