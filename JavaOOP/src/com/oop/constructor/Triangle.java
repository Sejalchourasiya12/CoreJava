package com.oop.constructor;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height =  height;
	}
	
	public int getBase() {
		return this.base;
	}
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public double area() {
	 double area = base*height * 1/2;	
		return area;
	}
}
