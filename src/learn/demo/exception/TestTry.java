package learn.demo.exception;

public class TestTry {

	
	public static void main(String[] args) {
		
//		try {
//			int n = 8/0;
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("finish1");
//		}
//		
//		try {
//			throw new MyException("myException");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("finish2");
//		}
		
		TestTry testTry = new TestTry();
		
//		try {
//			testTry.testException();
//		} catch (MyException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("testTry.test();");
		try {
			testTry.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("testTry.testRuntimeException();");
		try {
			testTry.testRuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		testTry.test();
		
	}
	
	public void testException() throws MyException {
		throw new MyException("myException");
	}
	
	public void testRuntimeException() {
		throw new MyRuntimeException("MyRuntimeException");
	}
	
	public void test() {
		testRuntimeException();
	}
	
}
