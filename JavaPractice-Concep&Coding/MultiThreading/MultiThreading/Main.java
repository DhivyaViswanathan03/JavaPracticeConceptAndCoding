package MultiThreading;

public class Main {

	public static void main(String[] args) {
		
//		SharedResource resource1=new SharedResource();
//		SharedResource resource2=new SharedResource();
		
		AvoidDeadLock resource1=new AvoidDeadLock();
		AvoidDeadLock resource2=new AvoidDeadLock();
		
		
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				resource1.test1(resource2);
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				resource2.test2(resource1);
				
			}
		});
		
		t1.start();
		t2.start();

	}

}
