package com.threads;

public class SyncBlockTest extends Thread {
	String s = "swamy";

	@Override
	public void run() {
		getMe();
	}

	public void getMe() {
		// lock on current object
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()
					+ "---With S Value--->" + s);
			s = s.concat("test");
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// Thread 1
		SyncBlockTest m1 = new SyncBlockTest();
		m1.start();

		// Thread 2
		SyncBlockTest m2 = new SyncBlockTest();
		m2.start();
	}
}