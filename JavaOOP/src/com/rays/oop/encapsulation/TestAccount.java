package com.rays.oop.encapsulation;

public class TestAccount {
public static void main(String[] args) {
	Account p = new Account();
	
	p.setNumber("98567322333");
	p.setBalance(2000);
	p.setAccountType("Saving");
	
	System.out.println("Name: " + p.getNumber());
	System.out.println("balance:" +p.getBalance());
	System.out.println("AccountType: " +p.getAccountType());
	
	p.deposit(500.00);
	p.withdrawl(3000.00);
	//p.fundTransfer(1000);
	//p.payBill(1000);
	
	
}
}
