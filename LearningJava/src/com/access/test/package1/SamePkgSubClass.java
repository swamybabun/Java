package com.access.test.package1;

public class SamePkgSubClass extends Employee {
	public static void main(String[] args) {
		SamePkgSubClass samePkgSubClass = new SamePkgSubClass();
		samePkgSubClass.defaultString = "100";
		samePkgSubClass.protectedString = "500";
		samePkgSubClass.publicString = "5000";
	}
}
