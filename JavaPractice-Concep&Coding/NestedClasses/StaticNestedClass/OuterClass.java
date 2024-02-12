package StaticNestedClass;

public class OuterClass {

	int instanceVar = 10;
	static int classVariable = 11;

	// public Access Modifier
//	static public class NestedClass{
//		public void print() {
//			System.out.println("OuterClass.NestedClass.print(): "+classVariable);
//		}
//	}

	// private

	private static class NestedClass {
		public void print() {
			System.out.println("NestedClass.print(): " + classVariable);
		}
	}

	void display() {
		System.out.println("OuterClass.display()");
		NestedClass ns = new NestedClass();
		ns.print();
	}

}
