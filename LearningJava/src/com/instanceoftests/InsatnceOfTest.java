package com.instanceoftests;

public class InsatnceOfTest extends Priority {
	public static void main(String[] args) {

		InsatnceOfTest referenceVariable = new InsatnceOfTest();

		OtherClass otherClass = new OtherClass();

		System.out.println("---------------------------------------------------------");
		if (referenceVariable instanceof InsatnceOfTest) {
			System.out.println("child class");
		}

		if (referenceVariable instanceof Priority) {
			System.out.println("super claass");
		}

		if (otherClass instanceof OtherClass) {
			System.out.println("other claass");
		}
	}
}