package AdvantageStaticFinalOverEnum;

public class Main {

	public static void main(String[] args) {
		System.out.println(isWeekend(1));
		System.out.println(isWeekend(EnumSample.SATURDAY));

	}

	private static boolean isWeekend(EnumSample day) {
		if(EnumSample.SATURDAY==day || EnumSample.SUNDAY==day ) {
			return true;
		}
		return false;
		
	}

	private static boolean isWeekend(int day) {
		if(WeekEnum.SATURDAY==day || WeekEnum.SUNDAY==day) {
			return true;
		}
		return false;
	}

}
