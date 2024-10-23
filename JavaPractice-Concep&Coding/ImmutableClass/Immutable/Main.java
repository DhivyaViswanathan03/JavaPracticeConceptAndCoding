package Immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("divs");
		list.add("priya");
		Address address=new Address("Bangalore");
		MyImmutableClass immutable=new MyImmutableClass("JAVA", list,address, new Date());
		immutable.getNamesList().add("mouli");
		immutable.getAddress().setCity("pune");
		immutable.getDate().setDate(15);
		System.out.println(immutable);

	}

}
