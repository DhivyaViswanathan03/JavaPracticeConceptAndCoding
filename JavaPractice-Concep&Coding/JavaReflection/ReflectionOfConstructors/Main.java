package ReflectionOfConstructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class sampleReflect = SampleReflect.class;
		Constructor[] constructors = sampleReflect.getDeclaredConstructors();
		for (Constructor cons : constructors) {
			cons.setAccessible(true);
			SampleReflect obj = (SampleReflect) cons.newInstance();
			obj.display();
		}

	}

}
