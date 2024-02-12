package Enum.CustomEnumClass;

public enum CustomEnum {
	
	MONDAY(1,"1 day"),
	TUESDAY(2,"2 day"),
	WEDNESDAY(3,"3 day"),
	THURSDAY(4,"4 day"),
	FRIDAY(5,"5 day");
	
	private int value;
	private String comment;

	CustomEnum(int value, String comment) {
		this.value=value;
		this.comment=comment;
	}
	
	public int getValue() {
		return value;
	}

	public String getComment() {
		return comment;
	}

	public static CustomEnum getEnumValue(int value) {
		for(CustomEnum enumSample:CustomEnum.values()) {
			if(enumSample.getValue()==value)
				return enumSample;
		}
		return null;
	}

}
