package com.rays.oop.encapsulation;

public class Automobile {

	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS =6;
	
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getNoOfGears(int noGears) {
	    if (noGears < 1 || noGears > NO_OF_GEARS) {
	        return "Invalid gear selected. Valid range is 1 to " + NO_OF_GEARS;
	    } else if (noGears == NO_OF_GEARS) {
	        return "Top gear! Speed is maximized.";
	    } else {
	        return "Gear " + noGears + " selected. Speed is moderate.";
	    }
	}
	public String getBrakeStatus(int brakePressure) {
	    if (brakePressure < 0) {
	        return "Invalid brake pressure.";
	    } else if (brakePressure == 0) {
	        return "Brake at zero. Car is slowing down.";
	    } else if (brakePressure == 1) {
	        return "Brakes released. Car is running.";
	    } else {
	        return "Brakes applied. Car is stopping.";
	    }
	}
}
