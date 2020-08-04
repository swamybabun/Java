package com.threads;

public class SyncMethodTest extends Thread {
	String s = "swamy";

	@Override
	public void run() {
		getMe();
	}

	// synchronized Method
	public synchronized void getMe() {
		System.out.println(Thread.currentThread().getName()
				+ "---With S Value--->" + s);
		s = s.concat("test");
		System.out.println(s);
	}

	public static void main(String[] args) {
		SyncMethodTest m1 = new SyncMethodTest();
		m1.start();

		SyncMethodTest m2 = new SyncMethodTest();
		m2.start();
	}
}