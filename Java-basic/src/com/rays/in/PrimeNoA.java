package com.rays.in;

public class PrimeNoA {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i=1; i<=100; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count>0) {
				System.out.println("this is not prime no:" +i);
			}else {
				System.out.println("this is prime no: " +i);
			}
		}
	}
}
