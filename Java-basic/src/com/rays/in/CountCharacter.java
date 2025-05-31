package com.rays.in;

public class CountCharacter {
public static void main(String[] args) {
	String name = "Veena";
	char ch = 'e';
	int count = 0;
	
	for(int i = 0; i<name.length(); i++) {
		
		if(name.charAt(i)==ch){
			count++;
		}
	}
	
	
	System.out.println(ch + "" + count);
}
}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            