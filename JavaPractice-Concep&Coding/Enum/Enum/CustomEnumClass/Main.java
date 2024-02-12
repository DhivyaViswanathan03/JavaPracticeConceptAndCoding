package Enum.CustomEnumClass;

public class Main {

	public static void main(String[] args) {
		CustomEnum sample = CustomEnum.getEnumValue(3);
		System.out.println(sample.getComment());
	}

}
