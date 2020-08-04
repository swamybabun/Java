package com.sbi.banking.payment.gateway.utils;

class Useful {
	public static void main(String[] args) {
		System.out.println(VariablesTypes.staticString);
		System.out.println("==========================");
		VariablesTypes simple=new VariablesTypes();
		System.out.println(simple.instanceVariable);
		simple.instanceVariable="suresh";
		System.out.println(simple.instanceVariable);
		System.out.println(VariablesTypes.staticString);
		System.out.println("============================");
		VariablesTypes.staticString="I am new static variable changed";
		VariablesTypes simple1=new VariablesTypes();
		System.out.println(simple1.instanceVariable);
		System.out.println(VariablesTypes.staticString);
		System.out.println("============================");
		VariablesTypes simple2=new VariablesTypes();
		System.out.println(VariablesTypes.staticString);
		System.out.println(simple2.instanceVariable);
		
	}
}
