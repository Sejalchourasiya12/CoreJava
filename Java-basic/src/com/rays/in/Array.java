package com.rays.in;

public class Array {

	public static void main(String[] args) {
		
		int[] i = {22,25,25,52,63};
		System.out.println("length:" +i.length);
		
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		for(int a:i) {
			System.out.println(a);
		}
	}
}