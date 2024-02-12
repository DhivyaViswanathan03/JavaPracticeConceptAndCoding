package FunctionalInterface;

public class SampleClass {

	public static void main(String[] args) {

		SampleA obj=new SampleA() {

			@Override
			public void demo() {
				System.out.println("SampleClass.main(...).new SampleA() {...}.demo()");
			}
		};
		obj.demo();

	}

}
