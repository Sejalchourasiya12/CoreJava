package com.rays.oop.polymorphism;

public class TestBankByArray {
	public static void main(String[] args) {
		
		Bank [] banks = new Bank[3];
		
		banks[0] = new AxisBank();
		banks[1] = new ICICBank();
		banks[2] = new HDFCBank();
		loanEnquiry(banks);
		
	}

	public static void loanEnquiry(Bank[] banks) {
		double total = 0;
		
		for(int i = 0; i<banks.length; i++) {
			System.out.println("IntrestRate " +banks[i].intrestRate());
			System.out.println("NAme " +banks[i].getName());
			
		}
		
	}

}
