package com.oct18;

public class OnlyGetEmployee {
	private String empId;
	private String name;
	private String company="HP";
	private String address;
	private String phone;

	public String getEmpId() {
		this.empId="123";
		// Common logic
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

}
