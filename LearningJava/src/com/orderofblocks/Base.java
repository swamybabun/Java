package com.orderofblocks;

public class Base {

	static {
		System.out.println("Base Static");
	}
	{
		System.out.println("Base Instance");
	}

	public Base() {
		System.out.println("Base Constructor");
	}

}
