package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestStudent {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	Student p = new Student();
	
	
	p.setName("Sejal");
	p.setDob(sdf.parse("2001/02/02"));
	p.setEnrollNo(8);
	p.setCourse("BTech");
	p.setAge(25);
	
	System.out.println("Student name:" +p.getName());
	System.out.println("Student Dob:" +sdf.format(p.getDob()));
	System.out.println("Student Enroll no:" +p.getEnrollNo());
	System.out.println("student course selected:" +p.getCourse());
	System.out.println("studemnt age:" +p.getAge());
}
}
