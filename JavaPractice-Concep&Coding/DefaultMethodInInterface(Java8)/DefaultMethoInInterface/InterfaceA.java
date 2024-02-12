package DefaultMethoInInterface;

public interface InterfaceA {
	
	default void demo() {
		System.out.println("InterfaceA.demo()");
	}

}

interface InterfaceB{
	//void demo();
	default void demo() {
		System.out.println("InterfaceB.demo()");
	}
}


class Sample implements InterfaceB,InterfaceA{

	@Override
	public void demo() {
		InterfaceA.super.demo();
	}


	
}