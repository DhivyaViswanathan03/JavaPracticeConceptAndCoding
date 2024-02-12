package NonStaticNestedClass.MemberInnerClass;

public class Main {

	public static void main(String[] args) {
		
		OuterClassA outerObj=new OuterClassA();
		OuterClassA.InnerClass innerObj=outerObj.new InnerClass();
		innerObj.display();

	}

}
