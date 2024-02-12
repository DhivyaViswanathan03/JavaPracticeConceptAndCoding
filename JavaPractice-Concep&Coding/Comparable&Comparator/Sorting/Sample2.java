package Sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		
		return e1.name.compareTo(e2.name);
	}
	
}

class Employee implements Comparable{
	String name;
	int eid;
	
	Employee(String name,int eid){
		this.name=name;
		this.eid=eid;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", eid=" + eid + "]";
	}

	@Override
	public int compareTo(Object obj1) {
		int id1=this.eid;
		Employee e=(Employee) obj1;
		int id2=e.eid;
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return +1;
		return 0;
	
	}

}
public class Sample2 {

	public static void main(String[] args) {
		
		//sorting based on id
		TreeSet<Employee> set=new TreeSet();
		Employee e1=new Employee("divs", 10);
		Employee e2=new Employee("suma", 9);
		Employee e3=new Employee("anwar", 20);
		Employee e4=new Employee("jeeva", 44);
		Employee e5=new Employee("priya", 7);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		System.out.println(set);
		
		System.out.println();
		//sorting based on employee name
		TreeSet<Employee> set1=new TreeSet(new MyComparator2());
		set1.add(e1);
		set1.add(e2);
		set1.add(e3);
		set1.add(e4);
		set1.add(e5);
		
		System.out.println(set1);
		
	}

}
