package NonStaticNestedClass.InheritanceWithSameOuterClass;

public class Main {

	public static void main(String[] args) {
		OuterClass outerObj=new OuterClass();
		OuterClass.InnerClass2 innerClass2Obj=outerObj.new InnerClass2();
		innerClass2Obj.display();

	}

}
