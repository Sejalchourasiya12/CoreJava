package com.rays.in;

public class ArrayA {
	
	public static void main(String[] args) {
		
		float [] mArray = new float[5];
		
		mArray[0] = 1.3f;
		mArray[1] = 1.5f;
		mArray[2] = 1.3f;
		mArray[3] = 1.5f;
		mArray[4] = 1.3f;
		
		for(int i = 0; i<mArray.length; i++) {
			System.out.println("mArray index: " +i + ":"  +mArray[i]);
		}
		
	}

}
