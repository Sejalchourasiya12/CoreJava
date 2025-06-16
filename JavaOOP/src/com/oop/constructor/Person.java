package com.oop.constructor;

public class Person {

	public int id;
	public String name;
	public String address;
	
	public Person() {
		System.out.println("default constructor");
		
	}
	
	public Person(int id) {
		this();
		this.id = id;
		System.out.println("this id " +this.id);
	}
	
	public Person(int id , String name) {
		this(id);
		this.name = name;
		System.out.println("Name" +name);
		}
	
	public Person(int id, String name, String address) {
		
		this(id , name);
		this.address = address;
		System.out.println("Address :" +address);
	}
}
