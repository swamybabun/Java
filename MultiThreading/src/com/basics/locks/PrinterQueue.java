package com.basics.locks;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterQueue {

	private final Lock queueLock = new ReentrantLock();

	public void printJob(Object document) {
		// Get the Lock
		queueLock.lock();

		// Do the Process
		try {
			Long duration = (long) (Math.random() * 10000);
			System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a Job during "
					+ (duration / 1000) + " seconds :: Time - " + new Date());
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// Release the lock
			System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
			queueLock.unlock();
		}
	}
}