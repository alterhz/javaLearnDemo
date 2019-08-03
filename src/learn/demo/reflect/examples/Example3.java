package learn.demo.reflect.examples;

public class Example3 {
	static void staticMethod() {
		System.out.println("执行staticMethod方法");
	}
	
	public int publicMethod(int i) {
		System.out.println("执行staticMethod方法");
		return i * 100;
	}
	
	protected int protectedMethod(String s, int i) throws NumberFormatException {
		System.out.println("执行protectedMethod方法");
		return Integer.valueOf(s) + i;
	}
	
	private String privateMethod(String ...args) {
		System.out.println("执行privateMethod方法");
		StringBuffer stringBuffer = new StringBuffer();

		for (int i=0; i<args.length; ++i) {
			stringBuffer.append(args[i]);
		}
		
		return stringBuffer.toString();
	}
	
}
