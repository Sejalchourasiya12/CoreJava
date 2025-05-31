package com.rays.in.oop.inheritance;

public class NeuroDoctor extends Doctor{
	

	private String surgerytype;
    private int experience;
  
    
    public String getSurgeryType() {
    	return this.surgerytype;  
    	
    }
    public void setSurgeryType(String surgerytype) {
    	this.surgerytype = surgerytype;
    }
    
    public int getExperience() {
    	return this.experience;
    }
    public void setExperience(int experience) {
    	this.experience = experience;
    }
}
