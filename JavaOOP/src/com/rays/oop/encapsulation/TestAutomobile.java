package com.rays.oop.encapsulation;

public class TestAutomobile {
public static void main(String[] args) {
	Automobile p = new Automobile();
	p.setColor("RED");
	p.setMake("Toyata");
	p.setSpeed(250);

	
	
	System.out.println("the color of automobile car :" +p.getColor());
	System.out.println("the speed of car:" +p.getSpeed());
	System.out.println("the model name is:" + p.getMake());
	System.out.println("the no of gears :" +p.getNoOfGears(6));
	System.out.println("the car brake works on :" +p.getBrakeStatus(5));
	
}
}
