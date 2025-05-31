package com.marks.in;

public class SwapNumber {

	public static void main(String[] args) {

		int a =7;
        int b = 8;
        
        System.out.println("Before Swap : " +a);
        System.out.println("Before Swap : " +b);
        
        a= a+b;
        b = a-b;
        a=a-b;
       
        System.out.println("After Swap : " +a);
        System.out.println("After Swap : " +b);
}
}
