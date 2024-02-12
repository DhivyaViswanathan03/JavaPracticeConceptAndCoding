package MonitorLockExample2;

public class SharedResource {
	
	boolean itemAvailable=false;
	
	public synchronized void addItem() {
		System.out.println("Inside add item..");
		itemAvailable=true;
		System.out.println("Notify all");
		notifyAll();
	}
	
	public synchronized void consumeItem() {
		System.out.println("Inside consume item");
		while(!itemAvailable) {
			try {
				System.out.println("Consumer in waiting state");
				wait();//release the monitor lock
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumer consumed the item");
		itemAvailable=false;
	}

}
