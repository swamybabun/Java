package com.oct18.abstraction;

public class HpPrinter implements Printer {

	@Override
	public void getPrint(String file) {
		System.out.println("Printing the file..." + file);
		System.out.println("Print Complete");
	}

	@Override
	public void getDocument(String file) {
		// TODO Auto-generated method stub
		
	}

	
}