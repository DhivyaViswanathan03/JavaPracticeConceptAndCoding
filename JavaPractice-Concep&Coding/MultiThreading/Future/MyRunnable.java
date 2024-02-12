package Future;

import java.util.List;

public class MyRunnable implements Runnable {
	List<Integer> obj;

	public MyRunnable(List<Integer> obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		obj.add(300);
	}

}
