package NestedInterface;

public class Main {

	public static void main(String[] args) {

		A obj1=new SampleClass();
		A.B obj2=new SampleClass2();
		A obj3 = new SampleClass3();
		A.B obj4 = new SampleClass3();
		
		obj1.demo1();
		obj2.demo2();
		obj3.demo1();
		obj4.demo2();
	}

}
