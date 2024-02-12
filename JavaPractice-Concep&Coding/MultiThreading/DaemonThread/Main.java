package DaemonThread;

public class Main {

	public static void main(String[] args) {
		
		SharedResource resource=new SharedResource();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 1 calling ..");
				resource.produce();
				
			}
		});
		
		t1.setDaemon(true);
		t1.start();
		
		
		
		System.out.println("Main thread finished :"+Thread.currentThread().getName());

	}

}
