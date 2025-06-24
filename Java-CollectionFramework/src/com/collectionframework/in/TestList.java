package com.collectionframework.in;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//list contains duplicate value
//list contain multiple null value
//list is natural order 

public class TestList {
public static void main(String[] args) {
	List list = new ArrayList();
	
	
	list.add("Ram");
	list.add(25);
	list.add(2.5);
	list.add("Ram");
	list.add(true);
	
	System.out.println(list);
	
	
	
	}
}
