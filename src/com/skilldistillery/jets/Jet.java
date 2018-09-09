package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private double range;
	private double price;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Jet() {
		
	}
	public Jet(String model, double speed, double range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public static void fly() {	
		System.out.println("Flying!");
	}
	
	public void getSpeedInMach() {
		
	}
	
}
