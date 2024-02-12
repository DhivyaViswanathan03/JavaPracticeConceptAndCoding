package CreateThread;

/**
 * Implements Runnable
 */
//class MyThread implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("code executed by thread:"+Thread.currentThread().getName());
//	}
//}

/**
 * Extends Thread class
 */
class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("code executed by thread:"+Thread.currentThread().getName());
	}
	
}

public class Main {

	public static void main(String[] args) {
		System.out.println("Start main method:"+Thread.currentThread().getName());
		MyThread myThreadObj=new MyThread();
		//Thread thread=new Thread(myThreadObj);
		//thread.start();
		
		myThreadObj.start();
		System.out.println("Finish Main Method:"+Thread.currentThread().getName());

	}

}
