package com.strings;

public class StringMethods {
	public static void main(String[] args) {
		String newString = "      sunil      ";
		if (newString != null) {
			System.out.println(newString.equals("SwamyBabu"));
		}
		System.out.println(newString.contains("nil"));
		System.out.println("DONE");
		System.out.println(newString.trim());
		//
		synchronized (StringMethods.class) {
			//cab booking and messgae sending process
		}
	}
}