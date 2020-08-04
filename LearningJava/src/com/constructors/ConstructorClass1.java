package com.constructors;

public class ConstructorClass1 {
	int a;
	int b;
	int c;

	public void getMe() {
		System.out.println("getMe Method");
	}

	public ConstructorClass1() {
		System.out.println("default constructor ::: without params");
	}

	public ConstructorClass1(int a, int b) {
		System.out.println("parameterized constructor ::: with params");
	}
	
	public ConstructorClass1(int a, int b,int c) {
		System.out.println("parameterized constructor ::: with params");
	}
}
