package com.skilldistillery.jets;

public interface CargoCarrier {
	
	public default void loadCargo() {
		System.out.println("LOAD THE PLANE!");
	}
}
