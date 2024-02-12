package StaticNestedClass.InheritanceWithDifferentOuterClass;

public class OuterClass {
	int instanceVar=10;
	static int classVar=20;
	

	static class InnerClass1{
		int innerClass2Var=10;
		void display() {
			System.out.println(classVar+" "+innerClass2Var);
		}
	}
}
