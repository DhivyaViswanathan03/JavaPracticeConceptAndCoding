package MonitorLockExample;

public class MyThread1Runnable implements Runnable{
	
	MonitorLockExample obj;
	MyThread1Runnable(MonitorLockExample obj){
		this.obj=obj;
	}

	@Override
	public void run() {
		obj.task1();
		
	}

}
