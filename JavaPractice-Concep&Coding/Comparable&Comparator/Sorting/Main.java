package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

class MyComparator3 implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
	}
	
}

class MyComparator implements Comparator{
	

	@Override
	public int compare(Object obj1, Object obj2) {
		String i1= obj1.toString();
		String i2=obj2.toString();
//		if(i1<i2)
//			return +1;
//		else if(i1>i2)
//			return -1;
//		else
		return i2.compareTo(i1);
	
	}

}



public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
//		TreeSet<Integer> input=new TreeSet(new MyComparator());
//		input.add(10);
//		input.add(15);
//		input.add(5);
//		input.add(11);
//		input.add(7);
//		input.add(11);
//		System.out.println(input);
		
		TreeSet<StringBuffer> set=new TreeSet();
		set.add(new StringBuffer("divs"));
		set.add(new StringBuffer("mouli"));
		set.add(new StringBuffer("demo"));
		set.add(new StringBuffer("reka"));
		set.add(new StringBuffer("viswa"));
		set.add(new StringBuffer("suma"));
		
		System.out.println(set);
		
		Integer[] arr= {10,3,15,7,0};
		
		Arrays.sort(arr, new MyComparator3());
		for(Integer a:arr) {
			System.out.println(a);
		}

	}

}


