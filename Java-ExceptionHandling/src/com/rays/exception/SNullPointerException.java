package com.rays.exception;

public class SNullPointerException {

	public static void main(String[] args) {
		String str = "Ram";
		int a = 0;
		int b = 15;
		
		try {
			System.out.println(str.length());
			int div = b/a;
			System.out.println(div);
		}catch (NullPointerException e) {
			System.out.println("exception1" +e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("exception2" +e.getMessage());
		}finally {
			System.out.println("i was executed");
		}
	}
}
