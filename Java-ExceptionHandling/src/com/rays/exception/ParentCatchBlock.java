package com.rays.exception;

public class ParentCatchBlock {

	public static void main(String[] args) {
		String str = null;
		int a = 5;
		int b = 15;
		
		try {
			System.out.println(str.length());
			int div = b/a;
		}catch (Exception e) {
			System.out.println("exception  :" +e.getMessage());
		}finally {
			System.out.println("i am always execute");
		}
		System.out.println("program compiled");
	}
}
