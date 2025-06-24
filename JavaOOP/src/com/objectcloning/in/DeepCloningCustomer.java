package com.objectcloning.in;

public class DeepCloningCustomer implements Cloneable {
	
	public String name ;
	public Account account = null;
	
	public DeepCloningCustomer(String name , Account account) {
		this.name = name ;
		this.account = account;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		DeepCloningCustomer c = (DeepCloningCustomer)super.clone();
		c.account = (Account)this.account.clone();
		
		return c;
	}

}
