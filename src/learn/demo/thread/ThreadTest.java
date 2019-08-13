package learn.demo.thread;

public class ThreadTest extends Thread {

	int count = 10;
	
	
	
	@Override
	public void run() {
		super.run();
		
		while (true) {
			System.out.println("count:" + count);
			
			if (--count == 0) {
				return ;
			}
		}
		
	}



	public static void main(String[] args) {
		new ThreadTest().start();
	}

}
