package com.collectionframework.in;

import java.util.ArrayList;
import java.util.Collection;

public class TestcollectionMethods {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		
		c1.add("KGF");
		c1.add(45);
		c1.add(41.25);
		c1.add('a');
		c1.add(true);
		
		System.out.println("c1" +c1);
		System.out.println("c1 contains Kalki" +c1.contains("KGF"));
        System.out.println("size of c1 " +c1.size());
        c1.remove("KGF");
        System.out.println("c1" +c1);
        System.out.println("size of c1" +c1.size());
        
        
        System.out.println("_________________________________________");
        
        Collection c2 = new ArrayList();
        
        c2.add("Kalki");
        c2.add(54);
        c2.add('d');
        c2.add(22.44);
        c2.add(false);
        
        System.out.println("c2 :" +c2);
        c1.addAll(c2);
        System.out.println("_________________________");
        System.out.println("c1 after adding" +c1);
        System.out.println("c1 mein c2 hai " +c2);
        c1.removeAll(c2);
        System.out.println("c1 after removing" +c2);
        System.out.println("c1 ma c2 hain " +c1.containsAll(c2));
        System.out.println("c1 is empty" +c1.isEmpty());
        c1.clear();
        System.out.println("c1 is empty ?" +c1.isEmpty());
        
	}
	
	
        
	}

	

