package ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
				new MyCustomThreadFactory(), new MyCustomRejectionHadler());
		executor.allowCoreThreadTimeOut(true);
		for (int i = 0; i < 6; i++) {

			executor.submit(new Runnable() {

				@Override
				public void run() {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Task performed by:" + Thread.currentThread().getName());

				}
			});
		}
	}

}

class MyCustomThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(Thread.NORM_PRIORITY);
		t.setDaemon(false);
		return t;
	}

}

class MyCustomRejectionHadler implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println("Task Rejected.." + executor.toString());
	}

}
