package learn.demo.generics;

public class A1 extends A {
	
	@Override
	public A1 getMe() {
		return this;
	}

	@Override
	public String getString() {
		return "A1";
	}

	@Override
	public void test() {
		super.test();
	}

	@Override
	public void print() {
		super.print();
	}

	public void printA1() {
		System.out.println("A1");
	}
	
}
