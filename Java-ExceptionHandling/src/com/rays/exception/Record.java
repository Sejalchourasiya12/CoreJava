package com.rays.exception;

public class Record {
	
	public static void main(String[] args) throws DuplicateRecordException {
		
	
	String oldUser = "admin";
    String newUser = "sejal";
	
		if(oldUser==newUser ) {
			throw new DuplicateRecordException("duplicate record");
		}else {
			System.out.println("this is new record");
		
	}
	}

}

