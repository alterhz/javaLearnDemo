package learn.demo.generics;

public class TestDefaultInterface {

	
	
	public static void main(String[] args) {
		Base base = new Base();
		base.print();
		base.print2();
		base.print3();
	}

}

interface IBase {
	default void print() {
		System.out.println("IBase.print");
	}
	
	default void print2() {
		System.out.println("IBase.print2");
	}
	
	default void print3() {
		System.out.println("IBase.print3");
	}
}

class Base implements IBase {
	public Base() {
		
	}
	
	public void print() {
		IBase.super.print();
		System.out.println("Base.print");
	}
}