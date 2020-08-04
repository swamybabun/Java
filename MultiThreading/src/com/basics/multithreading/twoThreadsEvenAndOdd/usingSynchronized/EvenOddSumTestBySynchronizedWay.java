package com.basics.multithreading.twoThreadsEvenAndOdd.usingSynchronized;

public class EvenOddSumTestBySynchronizedWay {
	public static void main(String[] args) {
		System.out.println("PRINT EVEN AND ODD BY TWO DIFFERENT THREADS USING SYNCHRONIZED WAY");

		SharedPrinter sharedPrinter = new SharedPrinter();

		int maxNumber = 10;

		Thread thread1 = new Thread(new EvenNumberProducer(sharedPrinter, maxNumber));
		Thread thread2 = new Thread(new OddNumberProducer(sharedPrinter, maxNumber));

		thread1.setName("EVEN THREAD");
		thread1.start();

		thread2.setName("ODD THREAD");
		thread2.start();
	}
}

// Reference : https://javaconceptoftheday.com/print-odd-and-even-numbers-by-two-threads-in-java/

//https://www.baeldung.com/java-even-odd-numbers-with-2-threads