package NonStaticNestedClass.InheritanceWithSameOuterClass;

public class OuterClass {
	int instanceVar=10;
	static int classVar=20;
	
	class InnerClass1{
		int innerClass1Var=10;
		
	}
	class InnerClass2 extends InnerClass1{
		int innerClass2Var=10;
		void display() {
			System.out.println(instanceVar+" "+classVar+" "+innerClass1Var+" "+innerClass2Var);
		}
	}
}
