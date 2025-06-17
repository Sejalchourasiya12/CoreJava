package com.collectionframework.in;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		
	c.add("Sejal");
	c.add(45);
	c.add(4.5);
	c.add('a');
	
	System.out.println("c"  +c);
	for(Object o : c) {
		System.out.println(c);
	}
		
	}

}
