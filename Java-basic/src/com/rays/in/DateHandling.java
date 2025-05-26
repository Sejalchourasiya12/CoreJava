
package com.rays.in;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateHandling {
   public static void main(String[] args)throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date d = sdf.parse("1996-11-24");
	
	System.out.println(d);
	System.out.println(sdf.format(d));
}
}
