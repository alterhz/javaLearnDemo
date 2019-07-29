package learn.demo.reflect.base;

import java.lang.reflect.Constructor;

public class Main {

	public static void main(String[] args) {
		exampleOfConstructor();
	}
	
	private static void exampleOfConstructor() {
		Example example = new Example("10", "20", "30");
		
		Class<? extends Example> exampleClass = example.getClass();
		
		Constructor<?>[] declaredConstructors = exampleClass.getDeclaredConstructors();
		for (Constructor<?> constructor : declaredConstructors) {
			System.out.println("multi args:" + constructor.isVarArgs());
			System.out.println("");
		}
	}
}
