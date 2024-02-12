package NonStaticNestedClass.MemberInnerClass.InheritanceWithDiffOuterClass;

public class InnerClass2 extends OuterClass.InnerClass1 {
	
	InnerClass2(){
		new OuterClass().super();
	}
	
	void print() {
		display();
	}

}
