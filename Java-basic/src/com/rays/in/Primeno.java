package com.rays.in;

public class Primeno {

	public static void main(String[] args) {
		int i = 7;
		int count = 0;
		
		for(int j = 2; j > i; j++) {
			if ( i % j == 0) {
				count++;
			}
		}
		System.out.println(count);
		if (count>0) {
		     System.out.println(i + " is not prime");
		} else{
			System.out.println(i + " is prime");
		}
	}
}
