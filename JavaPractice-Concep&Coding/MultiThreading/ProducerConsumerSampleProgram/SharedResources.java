package ProducerConsumerSampleProgram;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResources {
	int bufferSize;
	
	Queue<Integer> buffer;
	
	SharedResources(int bufferSize){
		buffer=new LinkedList<Integer>();
		this.bufferSize=bufferSize;
	}

	public synchronized void produceItem(int i) {
		if(buffer.size()==bufferSize) {
			System.out.println("Queue is full");
			try {
				wait(); //let consumer consume the item
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		buffer.add(i);
		System.out.println("Item added to list is:"+i);
		notifyAll();
		
		
	}

	public synchronized void consumeItem() {
		if(buffer.isEmpty()) {
			System.out.println("Queue is empty");
			try {
				wait();//let producer produce an item
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int item=buffer.poll();
		System.out.println("Consumed item is:"+item);
		notifyAll();
		
	}

}
