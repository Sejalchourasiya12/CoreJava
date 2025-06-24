package com.collectionlist.in;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(89);
		v.add("sejal");
		v.add('a');
		
		Enumeration e = v.elements();
		
		v.add('c');// isme list addd hoskti h after object
		 while(e.hasMoreElements()) {
			 Object o = (Object) e.nextElement();
			 System.out.println(o);
			 }
		
	}

}
