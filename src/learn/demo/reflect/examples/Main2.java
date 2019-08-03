package learn.demo.reflect.examples;

import java.lang.reflect.Field;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 example2 = new Example2();
		Class<?> exampleClass = example2.getClass();
		
		Field[] declaredFields = exampleClass.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println("变量名称：" + field.getName());
			
			Class<?> fieldType = field.getType();
			System.out.println("变量类型：" + fieldType);
			
			boolean isTurn = true;
			for (int i=0; i<2 && isTurn; ++i) {
				try {
					isTurn = false;
					System.out.println("修改当前值为:" + field.get(example2));
					
					if (fieldType.equals(int.class)) {
						System.out.println("使用setInt赋值");
						field.setInt(example2, 168);
					} else if (fieldType.equals(float.class)) {
						System.out.println("使用setFloat赋值");
						field.setFloat(example2, 99.9f);
					} else if (fieldType.equals(boolean.class)) {
						System.out.println("使用setBoolean赋值");
						field.setBoolean(example2, true);
					} else {
						System.out.println("使用set赋值");
						field.set(example2, "MWQ");
					}
					
					System.out.println("修改后的值：" + field.get(example2));
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("抛出异常，下面执行setAccessible方法");
					field.setAccessible(true);
					isTurn = true;
				}
			}
			
			System.out.println();
		}
	}

}
