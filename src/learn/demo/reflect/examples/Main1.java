package learn.demo.reflect.examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main1 {

	public static void main(String[] args) {
		exampleOfConstructor();
	}
	
	private static void exampleOfConstructor() {
		Example1 example = new Example1("10", "20", "30");
		
		Class<? extends Example1> exampleClass = example.getClass();
		
		Constructor<?>[] declaredConstructors = exampleClass.getDeclaredConstructors();
		for (Constructor<?> constructor : declaredConstructors) {
			System.out.println("是否为可变参数:" + constructor.isVarArgs());
			System.out.println("构造方法参数类型列表：");
			Class<?>[] parameterTypes = constructor.getParameterTypes();
			for (Class<?> parameterType : parameterTypes) {
				System.out.println(" " + parameterType);
			}
			
			System.out.println("可能抛出的异常：");
			Class<?>[] exceptionTypes = constructor.getExceptionTypes();
			for (Class<?> exceptionType : exceptionTypes) {
				System.out.println(" " + exceptionType);
			}
			
			Example1 newInstance = null;
			
			for (int i=0; i<3 && null == newInstance; ++i) {
				try {
					if (constructor.isVarArgs()) {
						// 可变参数[!!!使用二维数组]
						Object[] parameters = new Object[] {new String[] {"100", "200", "300", "400"}};
						newInstance = (Example1)constructor.newInstance(parameters);
					} else {
						if (parameterTypes.length == 0) {
							newInstance = (Example1)constructor.newInstance();
						} else if (parameterTypes.length == 2) {
							newInstance = (Example1)constructor.newInstance("7", 5);
						}
					}
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					//e.printStackTrace();
					System.out.println("构造函数不允许访问，改变访问方法");
					constructor.setAccessible(true);
				}
			}
			
			if (null != newInstance) {
				newInstance.print();
			}
			
			System.out.println("-----------------------------------------------");
		}
		
		
	}
}
