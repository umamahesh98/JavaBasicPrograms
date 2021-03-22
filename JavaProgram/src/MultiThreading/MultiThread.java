package MultiThreading;

class MultiThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}

class MultiThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class MultiThread {
	public static void main(String[] args) {
		MultiThread1 threadobj1 = new MultiThread1();
		MultiThread2 threadobj2 = new MultiThread2();
		threadobj1.start();
		threadobj2.start();
		threadobj1.setPriority(Thread.MAX_PRIORITY);

	}
}
