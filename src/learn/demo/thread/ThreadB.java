package learn.demo.thread;

public class ThreadB extends Thread {
	int n = 0;
	
	@Override
	public synchronized void start() {
		super.start();
		
		System.out.println("start ThreadB");
	}

	@Override
	public void run() {
		super.run();
		
		synchronized (this) {
			this.notify();
			System.out.println("ThreadB notify.");
		}
		
		while (true) {
			++n;
			
			if (1 == n) {
				synchronized(this) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			if (n > 100) {
				break;
			}
			
			System.out.println("ThreadB n:" + n);
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ThreadB finished.");
	}

}
