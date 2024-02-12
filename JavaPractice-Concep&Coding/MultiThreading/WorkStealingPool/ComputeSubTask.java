package WorkStealingPool;

import java.util.concurrent.RecursiveTask;

public class ComputeSubTask extends RecursiveTask<Integer> {
	int start;
	int end;
	
	ComputeSubTask(int start,int end){
		this.start=start;
		this.end=end;
	}

	@Override
	protected Integer compute() {
		
		if(end-start<=4) {
			int totalsum=0;
			for(int i=start;i<=end;i++) {
				totalsum+=i;
			}
			return totalsum;
		}else {
			
			int mid=(start+end)/2;
			
			ComputeSubTask leftTask=new ComputeSubTask(start, mid);
			ComputeSubTask rightTask=new ComputeSubTask(mid+1, end);
			
			leftTask.fork();
			rightTask.fork();
			
			int leftResult=leftTask.join();
			int rightResult=rightTask.join();
			return leftResult+rightResult;
		}
		
	}

}
