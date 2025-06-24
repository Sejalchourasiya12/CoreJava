package com.collectionlist.in;

public class Employee {

	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		
		if(!(obj instanceof Employee)) {
			return false;
		}
		
		Employee e = (Employee)obj;
		
		return this.id == e.id && this.name == name;
	}
	
	@Override
	public int hashCode() {
		String value = id + name;
		return value.hashCode();
	}
		
	
}
