package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Person p = new Person();
		
		p.setName("RAM");
		p.setDob(sdf.parse("2001/02/02"));
		p.setAddress("Indore");
		int age = p.getAge(p.getDob());
		
		
		System.out.println("name:" +p.getName());
		System.out.println("dob: " +p.getDob());
		System.out.println("address: " +p.getAddress());
		System.out.println("age: " +age);
		
		if(age == Person.AVG_AGE|| age>Person.AVG_AGE) {
			System.out.println("You are selected for voting");
		}
	}
}
