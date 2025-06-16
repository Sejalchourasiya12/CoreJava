package com.oop.dataabstraction;

public class TestBusinessman {
public static void main(String[] args) {
	
	
	Richman r = new Businessman();
	r.donation();
	r.earnMoney();
	r.party();
	
    SocialWorker s = new Businessman();
    
    s.helpToOther();
}
}
