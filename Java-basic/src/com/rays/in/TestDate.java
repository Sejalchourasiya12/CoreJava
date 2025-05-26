package com.rays.in;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String date = sdf.format(d);
		System.out.println("formated date: " +date);}
}
