package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {
	}

	public CargoPlane(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}

	public void loadCargo() {
		System.out.println("Time to load the " + this.getModel() + " cargo plane!");
	}
}
