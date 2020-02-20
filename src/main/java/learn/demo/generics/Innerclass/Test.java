package learn.demo.generics.Innerclass;

import learn.demo.generics.Innerclass.core.OuterClass;

public class Test {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		
		for (int i=0; i<10; ++i) {
			OuterClass.InnerClass innerClass1 = outerClass.getOrCreate(i);
			innerClass1.setValue("name" + i);
			
			if (i > 5) {
				outerClass.remove(i);
			}
		}
		
		
		
		outerClass.printAll();
	}
}
