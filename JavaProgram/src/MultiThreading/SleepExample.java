package MultiThreading;

import java.io.*;

public class SleepExample implements Runnable {
	public void run() {
		try {
			System.out.println("Please wait 500 milli seconds");
			Thread.sleep(10000);
			System.out.println("Thank you for waiting");
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		SleepExample sleep = new SleepExample();
		Thread t1 = new Thread(sleep);
		t1.start();
	}
}
