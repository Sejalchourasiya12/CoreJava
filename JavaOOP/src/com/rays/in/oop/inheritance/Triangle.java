package com.rays.in.oop.inheritance;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	public int getBase() {
		return this.base;
	}

	public int getHeight() {
		return height;
	}
	public void setBase(int base) {
		this.base = base;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double area() {
		double area = base * height/2;
		return area;
	}
	
}
