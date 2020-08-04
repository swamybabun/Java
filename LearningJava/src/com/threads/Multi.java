package com.threads;

public class Multi extends Thread {
	
	@Override
	public void run() {
		System.out.println("I am Thread and running...");
	}

	public static void main(String args[]) {
		Multi t1 = new Multi();
		t1.start();
	}
}