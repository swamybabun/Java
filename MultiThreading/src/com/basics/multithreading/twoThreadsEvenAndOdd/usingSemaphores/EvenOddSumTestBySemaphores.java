package com.basics.multithreading.twoThreadsEvenAndOdd.usingSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddSumTestBySemaphores {

	public static void main(String[] args) {
		System.out.println("PRINT EVEN AND ODD BY TWO DIFFERENT THREADS USING SEMAPHORES");
		SharedPrinter sharedPrinter = new SharedPrinter();

		int maxNumber = 10;

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new EvenNumberProducer(sharedPrinter, maxNumber));
		executorService.execute(new OddNumberProducer(sharedPrinter, maxNumber));

		executorService.shutdown();
	}
}

// Reference : https://massivetechinterview.blogspot.com/2015/12/printing-even-and-odd-using-two-threads.html

// https://www.baeldung.com/java-even-odd-numbers-with-2-threads