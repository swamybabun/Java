package com.orderofblocks;

public class Derived extends Base {
	static {
		System.out.println("Derived Static");
	}

	{
		System.out.println("Derived Instance");
	}

	public Derived() {
		System.out.println("Derived Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		Derived derived = new Derived();
		System.out.println("derived" + derived);
	}
}