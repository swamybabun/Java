package com.basics.multithreading.joinMethod;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		JoinThread joinThread = new JoinThread();

		Thread thread1 = new Thread(joinThread);
		thread1.setName("Thread1");

		Thread thread2 = new Thread(joinThread);
		thread2.setName("Thread2");

		Thread thread3 = new Thread(joinThread);
		thread3.setName("Thread3");

		thread1.start();

		// This makes all other threads to wait until thread1 completes its execution
		thread1.join();

		thread2.start();
		thread3.start();

	}
}