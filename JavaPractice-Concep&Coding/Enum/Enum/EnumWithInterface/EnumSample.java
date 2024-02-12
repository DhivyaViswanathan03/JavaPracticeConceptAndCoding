package Enum.EnumWithInterface;

public enum EnumSample implements Demo {
	MONDAY, 
	TUESDAY, 
	SUNDAY;

	@Override
	public void display() {
		System.out.println("EnumSample.display()");
	}

}
