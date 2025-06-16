package com.oop.dataabstraction;

public class Businessman extends Person implements Richman,SocialWorker {
	
	

	@Override
	public void helpToOther() {
		System.out.println("help together");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void earnMoney() {
		System.out.println("earn money");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void donation() {
		System.out.println("donation ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("party");
	}

}
