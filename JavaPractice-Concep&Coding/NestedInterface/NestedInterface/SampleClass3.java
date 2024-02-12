package NestedInterface;

public class SampleClass3 implements A,A.B{

	@Override
	public void demo2() {
		System.out.println("SampleClass3.demo2()");
	}

	@Override
	public void demo1() {
		System.out.println("SampleClass3.demo1()");
	}

}
