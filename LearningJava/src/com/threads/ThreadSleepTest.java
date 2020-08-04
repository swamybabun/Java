package com.threads;

public class ThreadSleepTest extends Thread {

	public void run() {
		for (int i = 1; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "  " + i);
			try {
				// thread to sleep for 1000 milliseconds
				System.out.println("Before-->" + System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("After-->" + System.currentTimeMillis());
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		ThreadSleepTest threadSleepTest = new ThreadSleepTest();
		// this will call run() function
		threadSleepTest.start();

		ThreadSleepTest threadSleepTest2 = new ThreadSleepTest();
		// this will call run() function
		threadSleepTest2.start();
	}
}