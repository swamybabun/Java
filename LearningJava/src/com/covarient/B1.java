package com.covarient;

public class B1 extends A {

	@Override
	public B1 printMe() {
		System.out.println("B Class");
		System.out.println("this--->" + this);
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String args[]) {
		B1 b1 = new B1();
		System.out.println("b1-->" + b1);
		B1 b12 = b1.printMe();
		b12.message();
	}
}
