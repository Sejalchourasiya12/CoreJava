package com.set.in;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		
		s.add(5);
		s.add(3);
		s.add(2);
		s.add(4);
		s.add(1);
		s.add(null);
		s.add(null);
		s.add(5);
		
		System.out.println("s" +s);
		
	}

}


