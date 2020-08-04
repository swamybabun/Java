package com.oct18.abstraction;

public abstract class MicrosoftPrinterBase {

	public void getDocument() {
		System.out.println("got document");
	}

	public void parsetheDocument(String file) {
		System.out.println("parsing document");
		// .....
		System.out.println("Parsing done");
	}

	public abstract void printDocument(String file);
}
