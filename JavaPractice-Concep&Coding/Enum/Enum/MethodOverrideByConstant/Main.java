package Enum.MethodOverrideByConstant;

public class Main {

	public static void main(String[] args) {
		
		EnumSample sample1=EnumSample.MONDAY;
		sample1.dummyMethod();
		
		EnumSample sample2=EnumSample.FRIDAY;
		sample2.dummyMethod();

	}

}
