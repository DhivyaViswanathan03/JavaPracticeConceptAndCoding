package Enum.MethodOverrideByConstant;

public enum EnumSample {
	MONDAY{
		@Override
		public void dummyMethod() {
			System.out.println("This is for Monday dummy method()");
		}
	},
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY;
	
	public void dummyMethod() {
		System.out.println("EnumSample.enclosing_method()");
	}

}
