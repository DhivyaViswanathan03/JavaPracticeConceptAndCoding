package FuntionInterface;

public class Main {

	public static void main(String[] args) {
		
		Function<Integer, String> obj=(Integer i)->{
			if(i>10) {
				return "integer greater than 10";
			}
			return null;
		};
		
		System.out.println(obj.apply(11));

	}

}
