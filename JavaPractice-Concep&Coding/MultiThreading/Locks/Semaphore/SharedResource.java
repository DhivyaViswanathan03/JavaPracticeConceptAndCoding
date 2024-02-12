package Locks.Semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
	Semaphore lock = new Semaphore(2);

	public void produce() {
	
		
		try {
			lock.acquire();
			System.out.println("lock acquired by :"+Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("lock released by :"+Thread.currentThread().getName());
			lock.release();
		}
	}



}
