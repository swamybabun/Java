package com.access.test.package2;

import com.access.test.package1.Employee;

public class OtherPkgNormalClass {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.publicString = "100";
		System.out.println(employee.publicString);
	}
}
