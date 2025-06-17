package com.rays.exception;

public class TestArithmeticByTryCatch {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 15;
		
		try {
			int div = b/a;
			System.out.println(div);
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("project is compiled");
		
	}

}
