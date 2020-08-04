package com.threads;

public class RunnableMulti implements Runnable {

	@Override
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		RunnableMulti m1 = new RunnableMulti();
		Thread t1 = new Thread(m1);
		t1.start();

		// thread 2
		RunnableMulti m2 = new RunnableMulti();
		Thread t2 = new Thread(m2);
		t2.start();
	}
}