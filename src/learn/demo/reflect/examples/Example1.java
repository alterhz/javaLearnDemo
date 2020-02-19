package learn.demo.reflect.examples;

public class Example1 {
	String s;
	int i, i2, i3;
	
	@SuppressWarnings("unused")
	private Example1() {
		
	}
	
	protected Example1(String s, int i) {
		this.s = s;
		this.i = i;
	}
	
	public Example1(String ...args) throws NumberFormatException {
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
		System.out.println("s=" + s);
		System.out.println("i=" + i);
		System.out.println("i2=" + i2);
		System.out.println("i3=" + i3);
	}
	
}
