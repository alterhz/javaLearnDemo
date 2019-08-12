package learn.demo.generics;

public class A {
	
	public A getMe() {
		return this;
	}
	
	public Object getString() {
		return "A";
	}
	
	public void print() {
		System.out.println(this.getClass().getName());
	}
	
	protected void test() {
		System.out.println(this.getClass().getName() + ".test");
	}
	
}
