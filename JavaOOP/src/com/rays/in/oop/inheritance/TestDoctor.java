package com.rays.in.oop.inheritance;

public class TestDoctor {
public static void main(String[] args) {
	
	Doctor d = new Doctor();
	NeuroDoctor d1 = new NeuroDoctor();
	
	
	d.setFees(500.00);
	d.setLicense(5695);
	d.setName("Sejal");
	d.setSpecialist("NeuroSurgeon");
	
	d1.setName("Ashika");
	d1.setExperience(5);
	d1.setFees(500);
	d1.setLicense(19841);
	d1.setSpecialist("Brain");
	
	System.out.println("Name :" +d.getName());
	System.out.println( "Fees : "+d.getFees());
	System.out.println("License no:" +d.getLicense());
	System.out.println("Specialist at: "+ d.getSpecialist());
	
	
	System.out.println("-----------------------------------------------------------------------------------------------");
	
	
	System.out.println("Name :" +d1.getName());
	System.out.println( "Fees : "+d1.getFees());
	System.out.println("License no:" +d1.getLicense());
	System.out.println("Specialist at: "+ d1.getSpecialist());
	System.out.println("Experience " +d1.getExperience());
}
}
