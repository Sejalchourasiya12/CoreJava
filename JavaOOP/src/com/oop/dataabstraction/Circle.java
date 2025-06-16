package com.oop.dataabstraction;

public class Circle extends ShapsAbstract{

	private int radius;
	public Circle() {
		System.out.println("this is sub");
	}
	public Circle(int i) {
		System.out.println("this is parametrizes");
	}
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}
