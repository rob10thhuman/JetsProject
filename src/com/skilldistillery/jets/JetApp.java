package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApp {
	Airfield petersonAFB = new Airfield();

	public static void main(String[] args) {
		JetApp letsRoll = new JetApp();
		letsRoll.userMenu();
	}

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
		Jet[] petersonJets = petersonAFB.getJetInventory();

		for (int i = 0; i < petersonJets.length; i++) {
			if (petersonJets[i] != null) {
				System.out.println(petersonJets[i]);
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

		Jet longestRange = null;
		double counter = 0;

		for (Jet jet : petersonAFB.getJetInventory()) {
			if (jet != null) {
				if (jet.getRange() > counter) {
					longestRange = jet;
					counter = jet.getRange();
				}
			}
		}
		System.out.println("The longest range aircraft is the " + longestRange.getModel() + ". Range is " + counter + " miles.");
	}

	public void jetsFly() {
		for (Jet jet : petersonAFB.getJetInventory()) {
			if (jet != null) {
				jet.fly(jet.getModel());
			}
		}
	}

	public void fastestJet() {
		Jet fastestJet = null;
		double counter = 0;

		for (Jet jet : petersonAFB.getJetInventory()) {
			if (jet != null) {
				if (jet.getSpeed() > counter) {
					fastestJet = jet;
					counter = jet.getSpeed();
				}
			}
		}
		System.out.println("The fastest aircraft is the " + fastestJet.getModel() + ". Speed is " + counter + " MPH.");
	}

	public void exitProgram() {
		System.out.println("Thank you for visiting the airfield.");
		System.exit(0);
	}

	public void dogFight() {
		for (Jet jet : petersonAFB.getJetInventory()) {
			if (jet !=null) {
				if (jet instanceof FighterJet) {
					System.out.println("These are your jet planes: " + jet.getModel());
				}
			}
		}
	}

	public void loadCargoJets() {
		
		for (Jet jet : petersonAFB.getJetInventory()) {
			if (jet !=null) {
				if (jet instanceof CargoPlane) {
					System.out.println("These are your cargo planes: " + jet.getModel());
				}
			}
		}
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
			
		Jet freshJet = new JetImpl(name, range, speed, price);
		petersonAFB.addJet(freshJet);

		listFleet(); 

		System.out.println("");
	}
}
