package ReflectionOfClass;

import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) {
		
		Class obj=Eagle.class;
		System.out.println(obj.getName());
		System.out.println(Modifier.toString(obj.getModifiers()));

	}

}
