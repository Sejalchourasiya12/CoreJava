package com.rays.oop.encapsulation;

public class Account {

	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
		return this.number;
		
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amt) {
		
		this.balance = this.balance + amt;
		System.out.println("Total balance after deposit:" +this.balance);
	}
	
	public void withdrawl(double amt) {
		if(balance>amt) {
			System.out.println("Insufficent balance");
		}else {
			System.out.println("Suufficent balance");
		}
		
		this.balance = this.balance - amt;
		System.out.println("Total balance after deposit: " + this.balance);
	}
		
	public void fundTransfer(double amt) {
			this.balance = this.balance - amt;
			System.out.println("Total funds are: " +this.balance);
		}
		public void payBill(double amt) {
			this.balance =this.balance - amt;
			System.out.println("total pay bill: " +this.balance);
		}
	}

