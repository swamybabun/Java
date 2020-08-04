package com.basics;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCreationByExtendingThread extends Thread {
	AtomicInteger atomicInteger = new AtomicInteger(0);

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Executing.." + atomicInteger.getAndIncrement());
		super.run();
	}

	public static void main(String[] args) {
		ThreadCreationByExtendingThread creation = new ThreadCreationByExtendingThread();

		Thread thread1 = new Thread(creation);

		Thread thread2 = new Thread(creation);

		thread1.start();

		thread2.start();

		System.out.println("Task finished ");
	}
}
