package com.skilldistillery.jets;

public class JetImpl extends Jet {
	String model; 
	double speed; 
	double range; 
	double price;
	
	public JetImpl(String model, double speed, double range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
		
}
