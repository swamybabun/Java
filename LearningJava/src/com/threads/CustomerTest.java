package com.threads;

public class CustomerTest {
	public static void main(String args[]) {

		final Customer customer = new Customer();

		// Starting withdraw thread

		Thread thread = new Thread() {
			public void run() {
				customer.withdraw(15000);
			}
		};
		thread.start();

		// Starting deposit thread
		new Thread() {
			public void run() {
				customer.deposit(10000);
			}
		}.start();
	}
}