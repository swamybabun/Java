package com.basics.multithreading.yieldMethod;

public class YieldExample {

	public static void main(String[] args) {
		YieldThread yieldThread = new YieldThread();

		Thread thread1 = new Thread(yieldThread);
		thread1.setName("Thread1");

		Thread thread2 = new Thread(yieldThread);
		thread2.setName("Thread2");

		Thread thread3 = new Thread(yieldThread);
		thread3.setName("Thread3");

		thread1.start();
		thread2.start();
		thread3.start();
	}
}