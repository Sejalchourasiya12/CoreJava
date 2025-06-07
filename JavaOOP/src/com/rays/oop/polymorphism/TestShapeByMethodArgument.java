package com.rays.oop.polymorphism;

public class TestShapeByMethodArgument {
public static void main(String[] args) {
	
	ShapePoly [] s = new ShapePoly [3];
	
	s[0] = new CirclePoly(2);
	s[1] = new RectanglePoly(5,7);
	s[2] = new Triangle(2,5);
	
	double total = totalArea(s);
	System.out.println(total);
}

public  static double totalArea(ShapePoly[] s) {
	double total = 0.0;
	for(int i =0; i<s.length; i++) {
		System.out.println("area" +s[i].area());
		total = total + s[i].area();
	}
	return total;
}


}

	


 