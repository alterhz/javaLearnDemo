package learn.demo.reflect.examples;

import java.lang.reflect.Method;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 example3 = new Example3();
		Class<?> exampleClass = example3.getClass();
		
		Method[] declaredMethods = exampleClass.getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			System.out.println("方法名：" + method);
			System.out.println("是否可变参数：" + method.isVarArgs());
			System.out.println("参数列表：");
			
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (Class<?> type : parameterTypes) {
				System.out.print(" " + type);
			}
			
			System.out.println("返回值类型：" + method.getReturnType());
			
			System.out.println("可能抛出的异常：");
			Class<?>[] exceptionTypes = method.getExceptionTypes();
			for (Class<?> exceptionType : exceptionTypes) {
				System.out.println(" " + exceptionType);
			}
			
			boolean isTurn = true;
			for (int i=0; i<2 && isTurn; ++i) {
				try {
					isTurn = false;
					if ("staticMethod".equals(method.getName())) {
						// static方法，可以没有对象
						method.invoke(null);
					} else if ("publicMethod".equals(method.getName())) {
						System.out.println("返回值为：" + method.invoke(example3, 168));
					} else if ("protectedMethod".equals(method.getName())) {
						System.out.println("返回值为：" + method.invoke(example3, "7", 5));
					} else if ("privateMethod".equals(method.getName())) {
						Object[] parameters = new Object[] {new String[] {"M", "W", "Q"}};
						System.out.println("返回值为：" + method.invoke(example3, parameters));
					}
					
				} catch (Exception e) {
					//e.printStackTrace();
					System.out.println("抛出异常，下面执行setAccessible方法");
					method.setAccessible(true);
					isTurn = true;
				}
			}
			
			System.out.println();
		}
	}

}
