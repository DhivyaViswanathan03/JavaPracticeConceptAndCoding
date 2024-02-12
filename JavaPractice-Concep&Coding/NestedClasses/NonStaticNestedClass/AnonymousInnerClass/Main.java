package NonStaticNestedClass.AnonymousInnerClass;

public class Main {

	public static void main(String[] args) {
		
		Car obj=new Car() {
			
			@Override
			void pressBreak() {
				System.out.println("Main.main(...).new Car() {...}.pressBreak()");
			}
		};
		
		obj.pressBreak();

	}

}
