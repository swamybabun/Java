package com.basics.multithreading.twoThreadsEvenAndOdd.usingSynchronized;

public class OddNumberProducer implements Runnable {
	SharedPrinter printer;
	int maxNumber;

	public OddNumberProducer(SharedPrinter sharedPrinter, int maxNumber) {
		this.printer = sharedPrinter;
		this.maxNumber = maxNumber;
	}

	@Override
	public void run() {

		for (int i = 1; i <= maxNumber; i = i + 2) {
			printer.printOdd(i);
		}
	}
}
