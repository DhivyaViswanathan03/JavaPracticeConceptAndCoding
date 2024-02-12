package Future;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;



public class FutureObj {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
				new MyCustomThreadFactory(), new MyCustomRejectionHadler());
		Future<?> futureObj = executor.submit(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					Thread.sleep(5000);
					System.out.println("Task is executed..");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		futureObj.isDone();
		try {
			futureObj.get(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		} catch (ExecutionException e) {
			System.out.println("ExecutionException");
		} catch (TimeoutException e) {
			System.out.println("Timeout exception");
		}
		futureObj.get();
		System.out.println(futureObj.isDone());
		System.out.println(futureObj.isCancelled());
		

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
