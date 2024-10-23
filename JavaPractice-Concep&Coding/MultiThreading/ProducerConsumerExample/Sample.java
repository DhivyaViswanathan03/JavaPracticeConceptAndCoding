package ProducerConsumerExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ConsumerProgram implements Runnable{
	BlockingQueue q=new BlockingQueue();
	@Override
	public void run() {
		q.get();
	}
}

public class Sample {
	public static void main(String[] args) {
		BlockingQueue q=new BlockingQueue(10);
		
		//Producer
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					q.put(i);
				}
				
			}
		});
		
			t1.start();
			
			//Consumer
			ConsumerProgram consumer=new ConsumerProgram();
			 ExecutorService executor = Executors.newFixedThreadPool(5);
			    for (int i = 1; i <= 5; i++) {
			      executor.submit(consumer);
			    }

	}
	

}
