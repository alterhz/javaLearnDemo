package learn.demo.thread;

public class ThreadA extends Thread {

	ThreadB threadB = new ThreadB();

	int n = 0;

	@Override
	public synchronized void start() {
		super.start();
		
		System.out.println("start ThreadA");
	}

	@Override
	public void run() {
		super.run();

		synchronized (threadB) {
			try {
				System.out.println("ThreadA wait before.");
				threadB.wait();
				System.out.println("ThreadA wait after.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		while (true) {
			++n;

			if (n > 100) {
				break;
			}

			System.out.println("ThreadA n:" + n);

			try {
				Thread.sleep(20);

				synchronized (threadB) {
					threadB.notify();
				}

				threadB.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ThreadA finished.");
	}

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		threadA.setPriority(MAX_PRIORITY);
		
		threadA.start();
		

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		threadA.threadB.start();

		
	}

}
