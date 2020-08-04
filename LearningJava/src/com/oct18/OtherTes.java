package com.oct18;


public class OtherTes {
	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setName("Sunill");
		employee.setEmpId("1");
		employee.setAddress("US");
		
		System.out.println("-------------------------------------");
		
		System.out.println(employee.getAddress());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getName());
		
		ContractEmployee contractEmployee=new ContractEmployee();
	}
}
