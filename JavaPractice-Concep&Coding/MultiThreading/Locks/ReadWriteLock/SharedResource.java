package Locks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
	
	
	public  void produce(ReadWriteLock lock) {
		lock.readLock().lock();
		System.out.println("Lock Acquired by :"+Thread.currentThread().getName());
		try {
			//Read operation
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Lock Released by :"+Thread.currentThread().getName());
			lock.readLock().unlock();
		}
		
		
	}

	public void consume(ReadWriteLock lock) {
		lock.writeLock().lock();
		System.out.println("Lock Acquired by :"+Thread.currentThread().getName());
		
		try {
			//Write operation
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Lock Released by :"+Thread.currentThread().getName());
			lock.writeLock().unlock();;
		}
		
	}

}
