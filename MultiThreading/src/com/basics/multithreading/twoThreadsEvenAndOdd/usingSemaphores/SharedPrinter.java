package com.basics.multithreading.twoThreadsEvenAndOdd.usingSemaphores;

import java.util.concurrent.Semaphore;

public class SharedPrinter {
	Semaphore semaphoreEven = new Semaphore(0);
	Semaphore semaphoreOdd = new Semaphore(1);

	public void printEven(int number) {
		try {
			semaphoreEven.acquire();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " - The Even Number " + number);
		semaphoreOdd.release();
	}

	public void printOdd(int number) {
		try {
			semaphoreOdd.acquire();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " - The Odd Number " + number);
		semaphoreEven.release();
	}
}