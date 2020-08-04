package com.access.test.package2;

import com.access.test.package1.Employee;

public class OtherPkgSubClass extends Employee {
	public static void main(String[] args) {
		OtherPkgSubClass otherPkgSubClass = new OtherPkgSubClass();
		otherPkgSubClass.protectedString="3000";
		otherPkgSubClass.publicString="13000";
		
	}
}
