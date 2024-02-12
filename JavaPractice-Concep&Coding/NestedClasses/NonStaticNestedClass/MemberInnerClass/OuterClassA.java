package NonStaticNestedClass.MemberInnerClass;

public class OuterClassA {
	int var1=10;
	static int var2=20;
	
	class InnerClass{
		
		void display() {
			System.out.println("OuterClassA.InnerClass.display():"+var1+" "+var2);
		}
		
	}

}
