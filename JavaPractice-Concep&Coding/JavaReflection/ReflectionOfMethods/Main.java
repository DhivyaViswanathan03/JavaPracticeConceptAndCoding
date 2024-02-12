package ReflectionOfMethods;

import java.lang.reflect.Method;

import ReflectionOfClass.Eagle;

public class Main {

	public static void main(String[] args) {
		Class obj=Egale.class;
		Method[] methods = obj.getMethods();
		for(Method method:methods) {
			System.out.println(method.getName());
			System.out.println(method.getReturnType());
		}

	}

}
