package com.oop.constructor;

public class TestShape {

	public static void main(String[] args) {
		
		System.out.println("_______Circle___________");
		Circle c = new Circle(2);
		
		
		
		System.out.println("radius" +c.getRadius());
		System.out.println("area of circle"  +c.area());
		
		System.out.println("Rectangle");
		
		Rectangle r = new Rectangle(4 , 5);
		
		System.out.println("Length" + r.getLength());
		System.out.println("Breadth" + r.getWidth());
		System.out.println("Area" + r.area());
		
		
		System.out.println("________Triangle_____________________");
		
		Triangle t = new Triangle(8 , 5);
		
		System.out.println("the base of triangle is " +t.getBase());
		System.out.println("the height of triangle is " +t.getHeight());
		System.out.println("the area of triangle is" + t.area());
		
	}
}
