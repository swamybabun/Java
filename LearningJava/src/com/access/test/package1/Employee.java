package com.access.test.package1;

public class Employee {
	private String privateString;
	protected String protectedString;
	public String publicString;
	String defaultString;

	public String getPrivateString() {
		return privateString;
	}

	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setPrivateString("060");
		employee.defaultString = "100";
		employee.protectedString = "500";
		employee.publicString = "5000";
	}
}