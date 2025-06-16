package com.rays.oop.polymorphism;

public class TestSumMethodOverloading {
	public static void main(String[] args) {
		Sum s = new Sum();
		
		s.Sum(4, 5);
		s.Sum(4, 5, 6);
		s.Sum(4.2, 6.2);
	}

	
}
