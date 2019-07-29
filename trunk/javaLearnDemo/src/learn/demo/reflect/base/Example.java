package learn.demo.reflect.base;

import sun.management.resources.agent;

public class Example {
	String s;
	int i, i2, i3;
	
	private Example() {
		
	}
	
	protected Example(String s, int i) {
		this.s = s;
		this.i = i;
	}
	
	public Example(String ...args) throws NumberFormatException {
		if (0 < args.length) {
			i = Integer.valueOf(args[0]);
		}
		
		if (1 < args.length) {
			i2 = Integer.valueOf(args[1]);
		}
		
		if (2 < args.length) {
			i3 = Integer.valueOf(args[2]);
		}
	}
	
	public void print() {
		System.out.print("s=" + s);
		System.out.print("i=" + i);
		System.out.print("i2=" + i2);
		System.out.print("i3=" + i3);
	}
	
}
