package com.collectionframework.in;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		
		c1.add("ram");
		c1.add("Shyam");
		
		Collection c2 = new ArrayList();
		
		c2.add("ram");
		c2.add("kans");
		
		c1.retainAll(c2);
		System.out.println(c1);
		
	}
}
