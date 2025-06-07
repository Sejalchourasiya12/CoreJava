package com.rays.oop.polymorphism;

public class TestShapeByConstructor {
public static void main(String[] args) {
	
	ShapePoly[] s = new ShapePoly[3];
	   
	s[0] = new CirclePoly(2);
	s[1] = new RectanglePoly(5,5);
	s[2] = new Triangle(2,2);
	
	for(int i = 0; i<s.length; i++) {
		System.out.println("area" +s[i].area());
	}
}
}
