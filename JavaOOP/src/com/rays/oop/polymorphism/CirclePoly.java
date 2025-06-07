 package com.rays.oop.polymorphism;

public class CirclePoly extends ShapePoly {
	
	private int radius;
	
	public CirclePoly() {
		
	}
   public CirclePoly(int radius) {
	   this.radius = radius;
   }
   
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
  @Override
    public double area() {
	double area = 3.14 * radius * radius ;
	return area;
}
}
