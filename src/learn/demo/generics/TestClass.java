package learn.demo.generics;

import static java.lang.Math.max;

public class TestClass {

	public static final int[] arrInt = {2, 2,3};
	
	public static void testStatic() {
		System.out.println("max:" + max(1, 3));
		
		arrInt[0] = 8;
		
		for (int i=0; i<arrInt.length; ++i) {
			System.out.println(arrInt[i]);
		}
		
		
		
	}
	
	
	public static int add(int a) {
		return -1;
	}
	
	public static int add(int... a) {
		int s = 0;
		for (int i=0; i<a.length; ++i) {
			s += a[i];
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		
		testStatic();
		
		A1 a1 = new A1();
		
		A1 a11 = a1.getMe();
		
		A a12 = a1.getMe();
		
		Object o = a1.getString();
		Object o2 = a1.getString();
		
		System.out.println("add(2)=" + add(2));
		System.out.println("add(2, 3, 4)=" + add(2, 3, 4));
	}
}
