package com.rays.oop.polymorphism;

public class ShapePoly {
	
	public double area() {
		return 0.0 ;
	}
public static ShapePoly getShapePoly(int i) {
		
		if(i==1) {
			return new CirclePoly(2);
		}
		
		
		if(i==2) {
			return new Triangle(2,2);
		}
		
		if(i==3) {
			return new RectanglePoly(5,5);
		}
		return new ShapePoly();
					
		}
	}


	


