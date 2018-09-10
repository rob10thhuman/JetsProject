package com.skilldistillery.jets;

import java.util.Scanner;


public class JetApp {
	Airfield petersonAFB = new Airfield();
	Jet[] petersonJets = petersonAFB.jetInventory;

	public static void main(String[] args) {
		JetApp letsRoll = new JetApp();
//		letsRoll.run();
		letsRoll.userMenu();
	}

//	public void run() {
////		Airfield petersonAFB = new Airfield();
////		petersonAFB.createJets();
////		Jet[] petersonJets = petersonAFB.jetInventory;
//	}

	public void userMenu() {

		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("Welcome to the Airfield!");
		System.out.println("Here are your options!");
		System.out.println("1 - List fleet");
		System.out.println("2 - Fly all jets");
		System.out.println("3 - View the fastest jet");
		System.out.println("4 - View jet with the longest range");
		System.out.println("5 - Load all Cargo Jets");
		System.out.println("6 - Dogfight!");
		System.out.println("7 - Add a jet to the fleet");
		System.out.println("8 - Quit");
		System.out.print("Please make a choice here: >> ");

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			listFleet();
			System.out.println("Press enter to continue...");
			try {
				System.in.read();
			} catch (Exception e) {
				e.printStackTrace();
			}
			// press Enter to continue
			userMenu();
		case 2:
//			Jet.fly(null);
//			JetImpl.fly();
			jetsFly();
			pressEnter();
			userMenu();
		case 3:
			fastestJet();
			pressEnter();
			userMenu();
		case 4:
			viewLongestRange();
			pressEnter();
			userMenu();
		case 5:
			loadCargoJets(); 
			pressEnter();
			userMenu();
		case 6:
			dogFight();
			pressEnter();
			userMenu();
		case 7:
			addJetToFleet();
			pressEnter();
			userMenu();
		case 8:
			exitProgram();
		default:
			userMenu();
		}

		scanner.close();
	}

	public void listFleet() {
		System.out.println("Listing the fleet");
		petersonAFB.createJets();
		Jet[] petersonJets = petersonAFB.jetInventory;

		for (int i = 0; i < petersonJets.length; i++) {
			if (petersonJets[i] != null) {
				System.out.println("Model: " + petersonJets[i].getModel() + " Speed: " + petersonJets[i].getSpeed()
						+ " mph " + " Range: " + petersonJets[i].getRange() + " miles " + " Price: "
						+ petersonJets[i].getPrice() + " Million");
			}
		}
	}

	public void pressEnter() {
		System.out.println("Press enter to continue...");
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void viewLongestRange() {
		petersonAFB.createJets();
		Jet[] petersonJets = petersonAFB.jetInventory;
		double printMax = 0;
		// I have an error here that is related to this value assignment to zero
		// vs the lowest range in the array

		for (int j = 0; j < petersonJets.length; j++) {
			if ((petersonJets[j] != null) && (petersonJets[j].getRange() > printMax)) {
				printMax = petersonJets[j].getRange();
				System.out.println("The jet with the max range is the " + petersonJets[j].getModel()
						+ " with a range of " + printMax);
				System.out.println("Model: " + petersonJets[j].getModel() + " Speed: " + petersonJets[j].getSpeed()
						+ " mph " + " Range: " + petersonJets[j].getRange() + " miles " + " Price: "
						+ petersonJets[j].getPrice() + " Million");

			}
		}

	}

	public void jetsFly() {
		petersonAFB.createJets();
		Jet[] petersonJets = petersonAFB.jetInventory;
		double printMax = 0;

		for (int j = 0; j < petersonJets.length; j++) {
			if ((petersonJets[j] != null) && (petersonJets[j].getRange() > printMax)) {
				System.out.println("Model " + petersonJets[j].getModel() + " is taking off!");
			}
		}

	}

	public void fastestJet() {
		petersonAFB.createJets();
		Jet[] petersonJets = petersonAFB.jetInventory;
		double printMax = 0;

		for (int j = 0; j < petersonJets.length; j++) {
			if ((petersonJets[j] != null) && (petersonJets[j].getSpeed() > printMax)) {
				printMax = petersonJets[j].getSpeed();
				System.out.println("Model " + petersonJets[j].getModel() + " is the fastest jet with a speed of "
						+ petersonJets[j].getSpeed() + " MPH.");
				System.out.println("Model: " + petersonJets[j].getModel() + " Speed: " + petersonJets[j].getSpeed()
						+ " mph " + " Range: " + petersonJets[j].getRange() + " miles " + " Price: "
						+ petersonJets[j].getPrice() + " Million");

			}
		}

	}

	public void exitProgram() {
		System.out.println("Thank you for visiting the airfield.");
		System.exit(0);
	}

	public void dogFight() {
		System.out.println("The dogfight goes here.");
//		petersonAFB.createJets();
//		Jet[] petersonJets = petersonAFB.jetInventory;
//		double printMax = 0;
//
//		for (int j = 0; j < petersonJets.length; j++) {
//			if ((petersonJets[j] != null) && (petersonJets[j].getSpeed() > printMax)) {
//				printMax = petersonJets[j].getSpeed();
//				System.out.println("The fastest jet is:");
//				System.out.println("Model: " + petersonJets[j].getModel() + " Speed: " + petersonJets[j].getSpeed()
//						+ " mph " + " Range: " + petersonJets[j].getRange() + " miles " + " Price: "
//						+ petersonJets[j].getPrice() + " Million");
//			}
//		}
//
//		printMax = 0;
//
//		for (int j = 0; j < petersonJets.length; j++) {
//			if ((petersonJets[j] != null) && (petersonJets[j].getRange() > printMax)) {
//				printMax = petersonJets[j].getRange();
//				System.out.println("The longest range jet is: ");
//				System.out.println("Model: " + petersonJets[j].getModel() + " Speed: " + petersonJets[j].getSpeed()
//						+ " mph " + " Range: " + petersonJets[j].getRange() + " miles " + " Price: "
//						+ petersonJets[j].getPrice() + " Million");
//			}
//		}
	}
	
	public void loadCargoJets() {
		System.out.println("This method should return the Cargo Jets.");
	}

	public void addJetToFleet() {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What model aircraft are you adding? >>");
		String name = kb.nextLine(); 

		System.out.println("What is the range of the aircraft are you adding? >>");
		Double range = kb.nextDouble(); 
		
		System.out.println("What is the speed of the aircraft are you adding? >>");
		Double speed = kb.nextDouble(); 
		
		System.out.println("What is the price of the aircraft are you adding? >>");
		Double price = kb.nextDouble(); 
			
		for (int i = 0; i < petersonJets.length; i++) {
			if (petersonJets[i] !=null) {
				new JetImpl(name, range, speed, price);
				petersonJets[i].setModel(name);
				petersonJets[i].setRange(range);
				petersonJets[i].setSpeed(speed);
				petersonJets[i].setPrice(price);				
			}
		}
		listFleet(); 

		
		System.out.println("");
		
		kb.close();
	}
}
