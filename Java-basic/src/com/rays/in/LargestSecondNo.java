package com.rays.in;

public class LargestSecondNo {

	public static void main(String[] args) {
		
		int[] arr = {25,26,27,15,27};
		int highest = 0;
		int secondhighest = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>highest) {
			secondhighest = highest;
			highest = arr[i];
		}if(arr[i]>secondhighest && arr[i]<highest) {
			secondhighest = arr[i];
			
		}
		
		
		
			
			
			
		}
		System.out.println("SecondLargest: " +secondhighest);
		
		
	}
}
