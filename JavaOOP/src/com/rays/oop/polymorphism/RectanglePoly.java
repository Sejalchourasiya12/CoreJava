package com.rays.oop.polymorphism;

public class RectanglePoly extends ShapePoly {

private int length;
private int width;

public RectanglePoly() {
	
}
public RectanglePoly(int length, int width) {
	this.length = length;
	this.width = width;
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
		double area = length * width;// TODO Auto-generated method stub
		return area;
	}


}
