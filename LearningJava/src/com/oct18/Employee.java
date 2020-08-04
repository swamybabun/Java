package com.oct18;

public class Employee {
	private String empId;
	private String name;
	private String address;
	private String phone;

	public String getEmpId() {
		// Common logic 
		return empId;
	}

	public void setEmpId(String empId) {
		// Validations and multithreading logic 
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}