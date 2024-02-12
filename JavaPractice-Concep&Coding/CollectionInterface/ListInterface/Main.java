package ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		List<String> inputs=new ArrayList();
		inputs.add("divs");
		inputs.add("mouli");
		inputs.add("reka");
		inputs.add("priya");
		
		ListIterator<String> itr=inputs.listIterator(inputs.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
