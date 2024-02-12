package NonStaticNestedClass.LocalInnerClass;

public class OuterClass {
	
	public void display() {
		class InnerClass {
			void print() {
				System.out.println("innerClass.print()");
			}
			
		}
		
		InnerClass innerObj=new InnerClass();
		innerObj.print();
	}

}
