package ConsumerInterface;

public class Main {

	public static void main(String[] args) {
		
	Consumer<String> obj=(String s)->{
		System.out.println("string is:"+s);
	};
	
	obj.accept("sample");

	}

}
