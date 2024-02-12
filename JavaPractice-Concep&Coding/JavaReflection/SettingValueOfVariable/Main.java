package SettingValueOfVariable;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {

		Class sampleReflect = SampleReflect.class;
		SampleReflect obj = new SampleReflect();
		
		// setting value of public variable
		Field field = sampleReflect.getDeclaredField("name");
		field.set(obj, "dvs");
		System.out.println(obj.name);
		
		//setting value of private variable
		
		Field field1 = sampleReflect.getDeclaredField("course");
		field1.setAccessible(true);
		field1.set(obj, "JAVA");
		System.out.println(obj.getCourse());

	}

}
