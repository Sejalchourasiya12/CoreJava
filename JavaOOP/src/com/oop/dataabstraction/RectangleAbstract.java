package com.oop.dataabstraction;

public class RectangleAbstract extends ShapsAbstract {
	
	private int length;
	private int width;
	
	public RectangleAbstract(int length , int width) {
		System.out.println("length:" +  length );
		System.out.println("width: " +width);
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
