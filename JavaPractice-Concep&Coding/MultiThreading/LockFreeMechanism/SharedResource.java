package LockFreeMechanism;

public class SharedResource {
	int counter;
	
	public void producer() {
		System.out.println("CUrrent thread is:"+Thread.currentThread().getName());
		counter++;
	}

	public int getCount() {
		return counter;
	}
}
