package com.oct18;

public class MathOperationsTest {
	public static void main(String[] args) {
		MathOperations mathOperations = new MathOperations();
		mathOperations.add(80, 20);

		mathOperations.add(80, 20, 100);

		mathOperations.add(500.25, 200.582);
	}
}