package com.rays.oop.encapsulation;

import java.util.Date;

public class Student {

	private String name ;
	private int enrollNo;
	private int age;
	private String course;
	private Date dob;
	
	public String getName() {
	return this.name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnrollNo() {
		return this.enrollNo;	
		}
	
	public void setEnrollNo( int enrollNo) {
		this.enrollNo = enrollNo; 
		}
		
		public int getAge() {
			return this.age;	
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getCourse() {
				return this.course;	
				}
				public void setCourse(String course) {
					this.course= course;
				}
				public Date getDob() {
					return this.dob;
				}
				
				public void setDob(Date dob) {
					this.dob= dob;
				}
}
