package Enum.EnumWithAbstractClass;

public enum EnumSample {
	MONDAY {
		@Override
		public void demo() {
			System.out.println("This is for Monday");
		}
	},
	TUESDAY {
		@Override
		public void demo() {
			System.out.println("This is for tuesday");
		}
	},
	WEDNESDAY {
		@Override
		public void demo() {
			System.out.println("This is for wednesday");
		}
	};
	public abstract void demo();

}
