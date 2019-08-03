package learn.demo.exception;

public class MyException extends Exception {
	/** */
	private static final long serialVersionUID = 1L;
	private final String describe;
	
	public MyException(String describe) {
		super(describe);
		this.describe = describe;
		
	}

	public String getDescribe() {
		return describe;
	}
}
