package com.basics.multithreading.yieldMethod;

public class YieldThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		System.out.println(Thread.currentThread().getName() + " yielding");
		Thread.yield();// It Causes the currently executing thread to temporarily pause and allow other
						// threads to execute.
		System.out.println(Thread.currentThread().getName() + "-> finished execution");
	}
}
