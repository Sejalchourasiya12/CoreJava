package com.collectionlist.in;

public class TestEqualsAndHashCode {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Ram");
		Employee e2 = new Employee(1,"Ram");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
