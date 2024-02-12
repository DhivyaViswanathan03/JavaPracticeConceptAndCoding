 package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class Car {
	 String type;
	 String name;
	 
	 Car(String type,String name){
		 this.type=type;
		 this.name=name;
	 }

	@Override
	public String toString() {
		return "car [type=" + type + ", name=" + name + "]";
	}


 }
class MyComparator4 implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Car c1=(Car) obj1;
		Car c2=(Car) obj2;
		
		return c1.name.compareTo(c2.name);
	}
	
}

public class Sample3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
     Car[] car=new Car[3];
     car[0]=new Car("fourwheeler", "swift");
     car[1]=new Car("threewheeler", "hyundai");
     car[2]=new Car("DDWheeler", "alto");
     
     Arrays.sort(car, new MyComparator4());
     for(Car c:car) {
    	 System.out.println(c);
     }
	}

}
