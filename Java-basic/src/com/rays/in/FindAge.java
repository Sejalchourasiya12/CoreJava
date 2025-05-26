package com.rays.in;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class FindAge {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date now =new Date();
	String dob = "1996-11-24";
	Date YourDob = sdf.parse(dob);
	System.out.println("current Date : " +now);
	System.out.println("my dob: "+YourDob);
	
	int age = now.getYear()- YourDob.getYear();
			System.out.println("my age : "+age);
	
}
}
