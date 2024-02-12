package SupplierInterface;

public class Main {

	public static void main(String[] args) {
		
		Supplier<String> obj=()->{
			return "hello";
		};
		System.out.println(obj.get());

	}

}
