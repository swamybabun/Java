package com.oct18.abstraction;

public class HPEPrinter extends MicrosoftPrinterBase {

	@Override
	public void printDocument(String file) {
		System.out
				.println("I am HP and Printing the document with the parsing data received from Microsoft");

	}

}
