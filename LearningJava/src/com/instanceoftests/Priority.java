package com.instanceoftests;

public class Priority {
	// Static block
	static {
		System.out.println("static block");
	}

	// constructor
	public Priority() {
		System.out.println("Constructor");
	}

	// initializer block
	{
		System.out.println("instance initilizer block");
	}

	public void getMe() {
		System.out.println("getMe Method");
	}

	public static void main(String[] args) {
		Priority priority = new Priority();
		priority.getMe();
	}
}