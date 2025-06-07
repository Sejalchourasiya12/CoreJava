package com.rays.oop.polymorphism;

 public class Triangle extends ShapePoly {
	 
	private int base;
	private int height;
	
	public Triangle() {
		//default Constructor
	}
	public Triangle(int base, int height) {
		
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		double area = base * height *1/2;// TODO Auto-generated method stub
		return area;
	}
	
	
}
