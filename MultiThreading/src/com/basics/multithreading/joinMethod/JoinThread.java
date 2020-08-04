package com.basics.multithreading.joinMethod;

public class JoinThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + "->" + i);
		}
	}
}