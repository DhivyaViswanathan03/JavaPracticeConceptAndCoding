package Join;

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
		
	
		t1.start();
		
		try {
			System.out.println("Main thread is waiting for thread 1 to complete the task");
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread finished :"+Thread.currentThread().getName());

	}

}
