package com.strings;

public class BasicStringTest {
	public static void main(String[] args) {
		String first = "swamy";
		String second = "swamy";
		String newFirst = new String("swamy");
		String newSecond = new String("SWAMY");
		// hash code
		System.out.println("----------------hashcode-------------------");
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());
		System.out.println(newFirst.hashCode());
		System.out.println(newSecond.hashCode());
		// equals
		System.out.println("----------------equals-------compares value------------");
		System.out.println(first.equals(second));
		System.out.println(first.equals(newFirst));
		System.out.println(newFirst.equals(newSecond));
		// ==
		System.out.println("----------------==---compares references----------------");
		System.out.println(first == second);
		System.out.println(first == newFirst);
		System.out.println(newFirst == newSecond);
		System.out.println(first == newFirst.intern());
	}
}