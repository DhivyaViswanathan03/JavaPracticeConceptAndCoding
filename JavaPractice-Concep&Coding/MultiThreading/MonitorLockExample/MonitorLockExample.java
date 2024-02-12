package MonitorLockExample;

public class MonitorLockExample {
	
	public synchronized void task1() {
		System.out.println("start task1");
		try {
			Thread.sleep(10000);
			System.out.println("Task1 completed");
		}catch(Exception e){
			
		}
	}
	
	public void task2() {
		System.out.println("task2 but before synchronized");
		synchronized (this) {
			System.out.println("Task2,Inside synchronized");
		}
	}
	
	public void task3() {
		System.out.println("MyClass.task3()");
	}

}
