package com.rays.in;

public class FindPrimeNo {
      public static void main(String[] args) {
	
         int i = 9;
         int count = 0;

       for(int j=2; j<i; j++) {
        if(i%j==0) {
	     count++;
        }
      }
        System.out.println(count);

       if(count>0) {
	     System.out.println("this is not prime no:" +i);
        }
          else {
        	System.out.println("this is prime no: " +i);
           }
     }
}