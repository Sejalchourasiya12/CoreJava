package com.oop.dataabstraction;

public class TriangleAbstract extends ShapsAbstract{
	
	private int base;
	private int height;
	
	public TriangleAbstract(int base , int height) {
		System.out.println("base:"+base);
		System.out.println("height:" +height);
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
		// TODO Auto-generated method stub
		return 0;
	}

}

