package com.basics.multithreading.twoThreadsEvenAndOdd.usingSemaphores;

public class EvenNumberProducer implements Runnable {
	SharedPrinter printer;
	int maxNumber;

	public EvenNumberProducer(SharedPrinter sharedPrinter, int maxNumber) {
		this.printer = sharedPrinter;
		this.maxNumber = maxNumber;
	}

	@Override
	public void run() {
		// print even numbers logic
		for (int i = 2; i <= maxNumber; i = i + 2) {
			printer.printEven(i);
		}
	}
}
