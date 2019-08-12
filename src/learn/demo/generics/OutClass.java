package learn.demo.generics;

interface OutInterface {
	void f();
}

class OutClass1 implements OutInterface {

	@Override
	public void f() {
		System.out.println("call OutClass1.f");
	}
}

public class OutClass {

	int m = 1;
	
	static int n = 8;
	
	static int addN() {
		return ++n;
	}
	
	static class InnerClass {
		static int m = 3;
		
		public static void test() {
			m += 1;
		}
		
		public void do1() {
			
			// 静态内部类不能访问外部类的非静态成员和方法
//			OutClass.this.m += 1;
		}
	}
	
	class InnerClass2 {
		// 普通内部类不能有静态成员和静态方法
//		static int m = 3;
		
//		static void test() {
//			
//		}
		
		public void do1() {
			// 但可以访问外部类的静态方法
			OutClass.this.m += 1;
		}
	}
	
	public OutClass1 do2() {
		return new OutClass1() {

			@Override
			public void f() {
				super.f();
				
				System.out.println("call OutClass.do2");
			}
			
		};
	}
	
	public OutInterface do1() {
		return new OutInterface() {

			@Override
			public void f() {
				System.out.println("call OutClass.do1");
			}
			
		};
	}
	
	public Object doIt() {
		class InterClass {
			String name = "tttt";

			@Override
			public String toString() {
				
				OutClass.this.m += 1;
				
				return super.toString() + " - name:" + name;
			}
		}
		
		return new InterClass();
	}
	
	public Object doIt2() {
		class InterClass {
			String name = "tttt";

			@Override
			public String toString() {
				
				OutClass.this.m += 1;
				
				return super.toString() + " - name:" + name;
			}
		}
		
		return new InterClass();
	}
	
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println(outClass.doIt());
		
		System.out.println("m:" + outClass.m);
		
		outClass.do1().f();
		outClass.do2().f();
	}
}
