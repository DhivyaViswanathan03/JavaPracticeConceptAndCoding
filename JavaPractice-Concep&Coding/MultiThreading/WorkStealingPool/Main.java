package WorkStealingPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Main {

	public static void main(String[] args) {
		
		ForkJoinPool pool=ForkJoinPool.commonPool();
		
		ForkJoinTask<Integer> futureObj = pool.submit(new ComputeSubTask(0, 100));
		try {
			System.out.println(futureObj.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
