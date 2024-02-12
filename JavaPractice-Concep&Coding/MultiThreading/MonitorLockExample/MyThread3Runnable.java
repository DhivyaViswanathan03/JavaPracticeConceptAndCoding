package MonitorLockExample;

public class MyThread3Runnable implements Runnable{
	
	MonitorLockExample obj;
	MyThread3Runnable(MonitorLockExample obj){
		this.obj=obj;
	}

	@Override
	public void run() {
		obj.task3();
		
	}

}
