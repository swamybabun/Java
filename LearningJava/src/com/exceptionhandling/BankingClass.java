package com.exceptionhandling;

public class BankingClass {
	int a = 10;
	int[] values = new int[5];

	public static void main(String[] args) throws Exception {
		BankingClass bankingClass = new BankingClass();
		String phone = "abc";
		try {
			System.out.println("phone " + bankingClass.getPhoneNumber(phone));
		} catch (PhoneNumberExceptionBYSUni e) {
			System.out.println("please give proper phone number");
		} 
	}

	public Integer getPhoneNumber(String phone)
			throws PhoneNumberExceptionBYSUni {
		Integer valueOf;
		try {
			valueOf = Integer.valueOf(phone);
		} catch (Exception e) {
			System.out.println("caught exception " + e.getMessage());
			throw new PhoneNumberExceptionBYSUni(
					"i have got wrong phone number");
		}
		return valueOf;
	}
}