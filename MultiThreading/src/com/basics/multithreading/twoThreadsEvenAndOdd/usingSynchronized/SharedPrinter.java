package com.basics.multithreading.twoThreadsEvenAndOdd.usingSynchronized;

public class SharedPrinter {
	// The Flag stores the status whether odd number is printed or not.
	
	// We can also declare this variable as Volatile but not necessary
	boolean isOddPrinted = false;

	/**
	 * printOdd() Method : This method is called by OddThread.
	 * 
	 * First, it checks the status isOddPrinted.
	 * 
	 * If isOddPrinted is true then it waits until next even number is printed by
	 * EvenThread.
	 * 
	 * If isOddPrinted is false then it prints next odd number, sets isOddPrinted to
	 * true and notifies EvenThread.
	 * 
	 * @param number
	 */
	public synchronized void printOdd(int number) {
		// if odd is printed then waiting for even to print
		while (isOddPrinted) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println(Thread.currentThread().getName() + "- The number" + number);

		isOddPrinted = true;
		
		notify();
	}

	/**
	 * printEven() Method : This method is called by EvenThread.
	 * 
	 * First, it checks the status of isOddPrinted.
	 * 
	 * If isOddPrinted is false then it waits until next odd number is printed by
	 * OddThread.
	 * 
	 * If isOddPrinted is true then it prints next even number, sets isOddPrinted to
	 * false and notifies OddThread.
	 * 
	 * @param number
	 */
	public synchronized void printEven(int number) {
		// if odd is not printed then waiting for odd to print
		while (!isOddPrinted) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "- The number" + number);

		isOddPrinted = false;
		notify();
	}
}