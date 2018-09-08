package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {
		// TODO Auto-generated constructor stub
	}

	public CargoPlane(String model, double speed, double range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public void loadCargo() {
		System.out.println("LOAD THE PLANE!");
	}
}
