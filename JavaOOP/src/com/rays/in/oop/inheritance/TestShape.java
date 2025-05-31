package com.rays.in.oop.inheritance;

public class TestShape {
	public static void main(String[] args) {
		
		Shape m = new Shape();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		m.setColor("yellow");
		m.setBorderWidth(2);
		c.setColor("Blue");
		c.setBorderWidth(5);
		c.setRadius(5);
		r.setLength(5);
		r.setWidth(7);
		t.setHeight(5);
		t.setBorderWidth(5);
		t.setColor("Pink");
		t.setBase(5);
		
		System.out.println("The color of Shape : " +m.getColor());
		System.out.println("The border and width of shape :" + m.getBorderWidth());
		System.out.println("The color o f Circle : " +c.getColor());
		System.out.println("The borderWidth of circle: " + c.getBorderWidth());
		System.out.println("The radius of circle :" +c.getRadius());
		System.out.println("The area of circle : " +c.area());
		System.out.println("The Rectangle length is:" + r.getLength());
		System.out.println("The Rectangle Width is :" +r.getWidth());
		System.out.println("The area of rectangle" +r.area());
		System.out.println("the color of triangle is " +t.getColor());
		System.out.println("the border of triangle is " +t.getBorderWidth());
		System.out.println("the height of triangle is " + t.getHeight());
		System.out.println("the base of triangle is : "+t.getBase());
		System.out.println("the area of triangle is " +t.area());

	
}
}
