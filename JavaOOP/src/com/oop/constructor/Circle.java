package com.oop.constructor;

import java.awt.geom.Area;

public class Circle extends Shape{
  
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
    public double area() {
    	double area = 3.14 *radius *radius;
    	return area;
    };
}
