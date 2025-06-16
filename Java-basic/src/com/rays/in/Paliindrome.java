package com.rays.in;

public class Paliindrome {
public static void main(String[] args) {
	
	int num =641;
	int rnum = 0;
	int temp = num;
	int r = 0;
	
	while(temp>0) {
		r=temp%10;
		rnum=rnum*10+r;
		temp =temp/10;
	}
	
	if(rnum==num) {
		System.out.println("this is palindrome: "+num);
	}else {
		System.out.println("this is not palindrome: "+num);
	}
}
}
