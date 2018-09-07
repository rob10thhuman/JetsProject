package com.skilldistillery.jets;

public class F16 extends Aircraft implements Missiles, Guns{
	private String name; 
	
	public F16() {
	}
	
	public F16(String model, double speed, double range, double price) {
	}
	
	public void setName(String name) {
		this.name=name; 
	}
	public String getName() {
		return name;
	}
	
}