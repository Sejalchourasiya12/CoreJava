package com.rays.exception;

public class BankAccountException {
	
	private double balance;
	
	public BankAccountException(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficentFundException{
		if(amount > balance) {
			throw new InsufficentFundException("Insufficent balance");
		}
		balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

	}
			



