package YStopResumeSuspenedDeprecated;

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
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 2 is calling..");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				resource.produce();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 1 is suspended");
		t1.suspend();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 1 is resumed");
		t1.resume();

	}

}
