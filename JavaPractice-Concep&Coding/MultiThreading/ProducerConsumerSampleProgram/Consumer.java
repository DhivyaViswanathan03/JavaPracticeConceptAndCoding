package ProducerConsumerSampleProgram;

public class Consumer {
	SharedResources resource;

	Consumer(SharedResources resource) {
		this.resource = resource;
	}

	public void callConsumer() {
		for(int i=0;i<4;i++) {
			resource.consumeItem();
		}
		
	}

}
