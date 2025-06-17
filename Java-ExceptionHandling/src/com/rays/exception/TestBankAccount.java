package com.rays.exception;

public class TestBankAccount {
public static void main(String[] args) throws InsufficentFundException {
	
	BankAccountException b = new BankAccountException(5000);
	

        b.withdraw(7000); 
      
}
	
	
	
	
}
