package com.rays.in;

import java.time.LocalDate;

public class DateExample {
public static void main(String[] args) {
	
	LocalDate today = LocalDate.now();
	System.out.println("today's date :" +today);
	System.out.println("1week before :" +today.minusWeeks(1));
	System.out.println("1 year before : " +today.minusYears(2));
}
}
