package com.skilldistillery.jets;

public class C130 extends Aircraft implements aI {
	private String name; 
	
	public C130() {
	}
	
	public C130(String model, double speed, double range, double price) {
	}
	
	public void setName(String name) {
		this.name=name; 
	}
	public String getName() {
		return name;
	}
	
}
