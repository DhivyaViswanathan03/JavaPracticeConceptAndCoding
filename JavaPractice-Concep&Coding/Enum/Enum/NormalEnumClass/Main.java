package Enum.NormalEnumClass;

public class Main {

	public static void main(String[] args) {
		
		for(EnumSample sample:EnumSample.values()) {
			System.out.println(sample.ordinal());
		}
		
		EnumSample value = EnumSample.valueOf("FRIDAY");
		System.out.println(value.name());

	}

}
