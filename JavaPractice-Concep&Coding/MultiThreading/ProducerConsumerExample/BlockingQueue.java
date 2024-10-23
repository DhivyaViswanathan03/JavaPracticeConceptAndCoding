package ProducerConsumerExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BlockingQueue {
	Condition isFullCondition;
	Condition isEmptyCondition;
	Lock lock;
	int size;
	Queue<Integer> queue;
	
	public BlockingQueue() {
		
	}

	public BlockingQueue(int size) {
		queue = new LinkedList<Integer>();
		this.size = size;
		lock = new ReentrantLock();
		isFullCondition = lock.newCondition();
		isEmptyCondition = lock.newCondition();
	}



	public void put(int item) {
		lock.lock();
		try {
			while (queue.size() == size) {
				try {
					isFullCondition.await();
				} catch (InterruptedException ex) {
				}
			}
			queue.add(item);
			System.out.println("Produced item is:"+item);
			isEmptyCondition.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public Integer get() {
		Integer t = null;
		lock.lock();
		try {
			while (queue.isEmpty()) {
				try {
					isEmptyCondition.await();
				} catch (InterruptedException ex) {
				}
			}
			t = queue.poll();
			System.out.println("Consumed item is:"+t);
			isFullCondition.signalAll();
		} finally {
			lock.unlock();
		}
		return t;
	}

	}
