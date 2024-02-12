package Sorting;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * Write program to insert string and string buffer objects into treeset where sorting is increasing
 * length order.If 2 objects are having same length then consider alpha order
 */

class MyComparator1 implements Comparator{
	

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1= obj1.toString();
		String s2=obj2.toString();
		int i1=s1.length();
		int i2=s2.length();
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return +1;
		
		else
		return s1.compareTo(s2);
	
	}

}

public class Sample {

	public static void main(String[] args) {
//		TreeSet<Object> set=new TreeSet(new MyComparator1());
//		set.add("A");
//		set.add(new StringBuffer("ABC"));
//		set.add(new StringBuffer("AA"));
//		set.add(new StringBuffer("XX"));
//		set.add(new StringBuffer("ABCE"));
//		set.add(new StringBuffer("A"));
//		System.out.println(set);
		TreeSet<Object> set=new TreeSet();
		set.add("A");
		set.add("AA");
		set.add("XX");
		set.add("ABCE");
		set.add("A");
		System.out.println(set);
	}

}
