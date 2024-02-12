package Future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableClass {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
				new MyCustomThreadFactory2(), new MyCustomRejectionHadler2());
		List<Integer> obj = new ArrayList();
		Future<List<Integer>> futureObj = executor.submit(new Callable<List<Integer>>() {

			@Override
			public List<Integer> call() throws Exception {
				obj.add(300);
				return obj;
			}
		});

		List<Integer> result = futureObj.get();
		System.out.println(result.get(0));
		System.out.println(obj);

	}
}

class MyCustomThreadFactory2 implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(Thread.NORM_PRIORITY);
		t.setDaemon(false);
		return t;
	}

}

class MyCustomRejectionHadler2 implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println("Task Rejected.." + executor.toString());
	}

}



