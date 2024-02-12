package Predicate;

public class Main {

	public static void main(String[] args) {
		
		Predicate<Integer> obj=(Integer i)->{
			if(i%2==0) {
				return true;
			}
			return false;
		};
		System.out.println(obj.test(10));

	}

}
