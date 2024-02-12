package ProducerConsumerExample;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
	Queue<Integer> buffer;
	int bufferSize;

	public SharedResource(int bufferSize) {
		buffer = new LinkedList<Integer>();
		this.bufferSize = bufferSize;
	}

	public synchronized void producer(int item) {
		if (buffer.size() == bufferSize) {
			System.out.println("Buffer is full");
			try {
				wait(); // let consumer to consume
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Produced item is :" + item);
		buffer.add(item);
		// Notify the consumer there are items to consume
		notifyAll();

	}

	public synchronized void consumer() {
		if (buffer.isEmpty()) {
			System.out.println("buffer is empty");
			try {
				wait();// let producer produce the item
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		int item = buffer.poll();
		System.out.println("Consumed item is:" + item);

		// Notify producer there is space to produce item
		notifyAll();

	}

}
