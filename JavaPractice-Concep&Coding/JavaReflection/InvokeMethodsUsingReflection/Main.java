package InvokeMethodsUsingReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class sampleClass = SampleReflection.class;
		Method[] methods=sampleClass.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method.getName());
		}
		//System.out.println(sampleClass.getDeclaredMethods());
		Object obj = sampleClass.newInstance();
		Method method = sampleClass.getMethod("fly", int.class);
		method.invoke(obj, 1);

	}

}
