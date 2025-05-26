package com.rays.in;

public class PrintRandomNoo {
public static void main(String[] args) {
	for(int i=1; i<=5; i++) {
		double n   = Math.random()*6;
		System.out.println(n);
	}
}
}
