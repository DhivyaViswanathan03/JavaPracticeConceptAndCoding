package MonitorLockExample;

public class MyThread2Runnable implements Runnable{
	
	MonitorLockExample obj;
	MyThread2Runnable(MonitorLockExample obj){
		this.obj=obj;
	}

	@Override
	public void run() {
		obj.task2();
		
	}

}
