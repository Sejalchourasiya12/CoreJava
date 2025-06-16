package com.rays.oop.polymorphism;

public class TestShapeByReturnType {
	public static void main(String[] args) {
		
	
	ShapePoly[] s = new ShapePoly[3];
	
	s[0] = ShapePoly.getShapePoly(1);//i=1;
	s[1] = ShapePoly.getShapePoly(3);//i=2;
	s[2] = ShapePoly.getShapePoly(2);
	
	
for(int i = 0; i<s.length; i++) {
	System.out.println("area :" +s[i].area());
}
}
}
