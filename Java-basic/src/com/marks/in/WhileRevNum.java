package com.marks.in;

public class WhileRevNum {
	public static void main(String[] args) {
		int num = 124;
		int rnum = 0;
		int temp = num;
		int r = 0;
		while(temp>0) {
			r= temp % 10;
			rnum = (rnum * 10) + r;
			temp = temp/10;
			
		}
		System.out.println(rnum);
	}

}
