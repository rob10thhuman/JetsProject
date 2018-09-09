package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApp {

	public static void main(String[] args) {
		JetApp letsRoll = new JetApp();
		letsRoll.userMenu(); 
	}

	private void run() {
		Airfield petersonAFB = new Airfield();
		petersonAFB.createJets();
		Jet[] petersonJets = petersonAFB.jetInventory;
		
//		userMenu();

//		for (int i = 0; i < petersonJets.length; i++) {
//			if (petersonJets[i] != null) {
//				System.out.println(petersonJets[i].getModel());
//				System.out.println(petersonJets[i].getPrice());
//				System.out.println(petersonJets[i].getRange());
//			}
//		}
	}

	private void listFleet() {
		System.out.println("MENU");
	
//		for (int i = 0; i < petersonJets.length; i++) {
//			if (petersonJets[i] != null) {
//				System.out.println(petersonJets[i].getModel());
//				System.out.println(petersonJets[i].getPrice());
//				System.out.println(petersonJets[i].getRange());
//			}
	}

	private void userMenu() {

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		System.out.println("Welcome to the Airfield!");
		System.out.println("Here are your options!");
		System.out.println("1 - List fleet");
		System.out.println("2 - Fly all jets");
		System.out.println("3 - View jet with the longest range");
		System.out.println("4 - Load all Cargo Jets");
		System.out.println("5 - Dogfight!");
		System.out.println("6 - Add a jet to the fleet");
		System.out.println("7 - Quit");

		switch (choice) {
		case 1:
			listFleet();
//			break;
		case 2:
			// Perform "encrypt number" case.
//			break;
		case 3:
			// Perform "decrypt number" case.
//			break;
		case 4:
			// Perform "quit" case.
//			break;
		default:
			// The user input an unexpected choice.
		}

	}

//		C130 hercules = new C130("C130", 368, 2361, 30); 
//		C5 starlifter = new C5("C5", 500, 1498, 225); 
//		F16 viper = new F16("F16", 1500, 2622, 19); 
//		F22 raptor = new F22("F22", 1498, 1839, 339); 
//		F35 lightning = new F35("F35", 1550, 1200, 95); 

//		FighterJet fighterJet = new FighterJet();
//		Jet[] jetInventory = new Jet[10]; 
//		jetInventory[0]=new FighterJet("F16",1500,2622,19);
//		jetInventory[1]=new FighterJet("F22",1498,1839,339);
//		jetInventory[2]=new FighterJet("F35",1550,1200,95);
//		jetInventory[3]=new CargoPlane("C130",368,2361,30);
//		jetInventory[4]=new FighterJet("C5",1550,7273,225);

}
