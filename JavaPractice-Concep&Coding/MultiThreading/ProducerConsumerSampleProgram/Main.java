package ProducerConsumerSampleProgram;

public class Main {

	public static void main(String[] args) {
		
		SharedResources resource=new SharedResources(2);
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Producer p=new Producer(resource);
				p.callProducer();
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Consumer c=new Consumer(resource);
				c.callConsumer();
				
			}
		});
		t1.start();
		t2.start();

	}

}
