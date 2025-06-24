package com.collectionlist.in;

import java.util.ArrayList;
import java.util.List;

public class TestArraytlist {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(0,"Ram");
		list.add(1,25);
		list.add(2,2.5);
		list.add(3,true);
		 
		System.out.println("List :" +list);
		System.out.println(list.get(3));
		System.out.println(list.remove(3));
		
		System.out.println("------------------------------");
		
		System.out.println("Value is remove on index 3 " +list);
		list.set(0, "shyam");
		System.out.println(list);
		System.out.println("last indexOf " +list.indexOf("shyam"));
		
		
	}

}
