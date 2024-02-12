package Future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ReturnObjectusingRunnable {
	
	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
				new MyCustomThreadFactory(), new MyCustomRejectionHadler());
		List<Integer> obj=new ArrayList();
		Future<List<Integer>> futureObj = executor.submit(new MyRunnable(obj), obj);
		
		try {
			List<Integer> result = futureObj.get();
			System.out.println(result.get(0));
			System.out.println(obj);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		} catch (ExecutionException e) {
			System.out.println("ExecutionException");
		}
		
		
	}
}


	class MyCustomThreadFactory1 implements ThreadFactory {

		@Override
		public Thread newThread(Runnable r) {
			Thread t = new Thread(r);
			t.setPriority(Thread.NORM_PRIORITY);
			t.setDaemon(false);
			return t;
		}

	}

	class MyCustomRejectionHadler1 implements RejectedExecutionHandler {

		@Override
		public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
			System.out.println("Task Rejected.." + executor.toString());
		}

	}


