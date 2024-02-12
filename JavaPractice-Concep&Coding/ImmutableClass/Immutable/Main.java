package Immutable;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("divs");
		list.add("priya");
		MyImmutableClass immutable=new MyImmutableClass("JAVA", list);
		immutable.getNamesList().add("mouli");
		System.out.println(immutable.getNamesList());

	}

}
