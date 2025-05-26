package com.rays.in;

public class FactorialSeries {
	
	public static void main(String[] args) {
		
		int i = 5;
		int sum =1;
		
		for(int j=i; j>=1; j--) {
			sum*= j;
			}
		System.out.println(sum);
		}

}
