package com.skilldistillery.jets;

public class F35 extends Aircraft implements Transformer {
	private String name; 
	
	public F35() {
	}
	
	public F35(String model, double speed, double range, double price) {
	}
	
	public void setName(String name) {
		this.name=name; 
	}
	public String getName() {
		return name;
	}
	
}