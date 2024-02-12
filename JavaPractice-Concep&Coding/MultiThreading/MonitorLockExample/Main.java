package MonitorLockExample;

import Locks.ReentrantLock.SharedResource;

public class Main {

	public static void main(String[] args) {
		
		SharedResource obj=new SharedResource();
		
		Thread t1=new Thread(()->{
			try {
				Thread.sleep(10000);
//				obj.addItem();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		});
		
		Thread t2=new Thread(()->{
//			obj.consumeItem();
		});
		
		t1.start();
		t2.start();

	}

}
