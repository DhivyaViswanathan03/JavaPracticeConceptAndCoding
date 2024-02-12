package Join;

public class SharedResource {
	
	boolean isAvailable=false;
	
	public synchronized void produce() {
		System.out.println("Lock Acquired by :"+Thread.currentThread().getName());
		isAvailable=true;
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Lock Released by :"+Thread.currentThread().getName());
	}

}
