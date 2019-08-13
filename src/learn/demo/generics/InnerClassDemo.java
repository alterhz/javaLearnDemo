package learn.demo.generics;

public class InnerClassDemo {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		
		OutInnerClass outInnerClass = new OutInnerClass(classA);
	}
}

class ClassA {
	
	public int n = 3;
	
	public ClassA() {
		System.out.println("construct ClassA");
	}
	
	class ClassB {
		int m = 5;
		
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
	
	public void do1() {
		++m;
		
		
	}
	
}
