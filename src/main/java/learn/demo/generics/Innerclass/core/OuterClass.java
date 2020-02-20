package learn.demo.generics.Innerclass.core;

import java.util.HashMap;
import java.util.Map;

public class OuterClass {
	
	int createObjectCount = 0;
	
	Map<Integer, InnerClass> allInnerClass = new HashMap<Integer, OuterClass.InnerClass>();
	
	public class InnerClass {
		final int key;
		String value;
		
		public InnerClass(int key) {
			this.key = key;
			
			++createObjectCount;
		}
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return super.toString() + "- key:" + key + ",value:" + value;
		}
		
	}
	
	public InnerClass getOrCreate(int key) {
		return allInnerClass.computeIfAbsent(key, k -> new InnerClass(k));
	}
	
	public void remove(int key) {
		allInnerClass.remove(key);
	}
	
	public void printAll() {
		for (InnerClass innerClass : allInnerClass.values()) {
			System.out.println(innerClass);
		}
		
		System.out.println("createObjectCount:" + createObjectCount);
	}
	
}
