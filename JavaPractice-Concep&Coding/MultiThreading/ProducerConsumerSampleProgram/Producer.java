package ProducerConsumerSampleProgram;

public class Producer {
	
	SharedResources resource;
	
	Producer(SharedResources resource){
		this.resource=resource;
	}

	public void callProducer() {
		for(int i=0;i<4;i++) {
			resource.produceItem(i);
		}
		
	}

}
