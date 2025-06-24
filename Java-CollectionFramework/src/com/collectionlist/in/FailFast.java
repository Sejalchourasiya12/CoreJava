package com.collectionlist.in;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("ram");
		list.add(44);
		list.add(1.2);
		list.add(true);
		
		
		System.out.println("list" +list);
		
		System.out.println("___________________");
		
		Iterator it = list.iterator();
		
		//list.add('a');(iterator k object k baad  kabhi b list add nhi hoti
		
		while(it.hasNext()) {
			Object o = (Object) it.next();
			System.out.println(o);
			
		
		}
	}

}
