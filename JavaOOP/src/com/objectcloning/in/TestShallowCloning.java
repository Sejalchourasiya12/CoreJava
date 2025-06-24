package com.objectcloning.in;

public class TestShallowCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Account a1 = new Account(1000);

	    Account a2 = (Account)a1 . clone();
	    
	    a2.balance = 300;
	    System.out.println(a1.balance);

		System.out.println(a2.balance);
	    
	}

}
