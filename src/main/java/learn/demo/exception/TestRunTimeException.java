package learn.demo.exception;

public class TestRunTimeException {

	public static void test() {
		int n = 0;
		for (int i=0; i<10; ++i) {
			n += i;
			if (i >= 0) {
				throw new RuntimeException("i:" +i);
			}
		}
		
		System.out.print("n:" + n);
	}
	
	public static void main(String[] args) {
		
		test();
		
		System.out.print("finish");
	}
}
