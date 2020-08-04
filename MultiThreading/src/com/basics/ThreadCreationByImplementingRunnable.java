package com.basics;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCreationByImplementingRunnable implements Runnable {
	
	AtomicInteger atomicInteger = new AtomicInteger(0);

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Executing.." + atomicInteger.getAndIncrement());
	}

	public static void main(String[] args) {
		ThreadCreationByImplementingRunnable creation = new ThreadCreationByImplementingRunnable();

		Thread thread1 = new Thread(creation);

		Thread thread2 = new Thread(creation);

		thread1.start();

		thread2.start();

		System.out.println("Task finished");
	}
}
