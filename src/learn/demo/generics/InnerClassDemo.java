package learn.demo.generics;

public class InnerClassDemo {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		
		OutInnerClass outInnerClass = new OutInnerClass(classA);
	}
}

class ClassA {
	
	public ClassA() {
		System.out.println("construct ClassA");
	}
	
	class ClassB {
		public ClassB() {
			System.out.println("construct ClassB");
		}
	}
}

class OutInnerClass extends ClassA.ClassB {
	public OutInnerClass(ClassA a) {
		a.super();
		
		System.out.println("construct OutInnerClass");
	}
	
}
