package com.sbi.banking.payment.gateway.utils;

public class VariablesTypes {

	static String staticString = "I am static varible";

	String instanceVariable = "I am Instance variable";

	public static void main(String[] args) {
		String localVariable = "I am local variable";
		System.out.println(localVariable);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void mul(int a, int b) {
		System.out.println(a * b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}
}