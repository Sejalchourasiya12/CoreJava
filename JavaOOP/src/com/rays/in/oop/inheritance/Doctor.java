package com.rays.in.oop.inheritance;

public class Doctor {
  protected String Name;
  protected double Fees;
  protected int License;
  protected String Specialist;
  
  public String getName() {
	  return this.Name;
	
}
  public void setName(String name) {
	  this.Name= name;
  
} 
  public double getFees() {
	  return this.Fees;
  }
  
  public void setFees(double fees) {
	  this.Fees = fees;
	  
  }
  public int getLicense() {
	  return this.License;
  }
  public void setLicense( int license) {
	  this.License = license;
  }
  public String getSpecialist() {
	  return this.Specialist;
  }
  public void setSpecialist(String specialist) {
	  this .Specialist = specialist;
  }
  
}
