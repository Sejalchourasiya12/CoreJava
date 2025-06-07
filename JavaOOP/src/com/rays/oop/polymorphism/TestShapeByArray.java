package com.rays.oop.polymorphism;

public class TestShapeByArray {
public static void main(String[] args) {
	
	ShapePoly [] s = new ShapePoly[3];
	s[0] = new CirclePoly();
	s[1] = new RectanglePoly();
	s[2] = new Triangle();
	
	
	
	
	
	CirclePoly c = (CirclePoly) s[0];
	c.setRadius(5);
	
	
	
	RectanglePoly r = (RectanglePoly) s[1];
	r.setLength(5);
	r.setWidth(7);
	
	
	Triangle t =  (Triangle) s[2];
	t.setBase(7);
	t.setBase(5);
	
	
	System.out.println("get area of circle " + c.area());
	System.out.println("get radius  of circle" + c.getRadius());
	System.out.println("-------------------------------");
	
	System.out.println("get area of triangle " + t.area());
	System.out.println("get length of triangle" +t.getBase());
	System.out.println("get height of triangle" + t.getHeight());
System.out.println("__________________________________________________________");

System.out.println("get area of rectangle " +r.area());
System.out.println("get length of rectangle " +r.getLength());
System.out.println("get widht of rectangle" +r.getWidth());
	
}
}
