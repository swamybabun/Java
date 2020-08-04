package com.threads;

public class StaticSyncTest extends Thread {
	static String s = "swamy";

	@Override
	public void run() {
		getMe();
	}

	// lock will be on Class not on Object because of static synchronization
	public static synchronized void getMe() {
		System.out.println(Thread.currentThread().getName()
				+ "---With S Value--->" + s);
		s = s.concat("test");
		System.out.println(s);
	}

	public static void main(String[] args) {
		// Thread 1
		StaticSyncTest m1 = new StaticSyncTest();
		m1.start();

		StaticSyncTest m2 = new StaticSyncTest();
		m2.start();
	}
}