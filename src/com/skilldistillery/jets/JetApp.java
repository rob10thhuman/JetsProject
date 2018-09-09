package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApp {
	Airfield petersonAFB = new Airfield();

	public static void main(String[] args) {
		JetApp letsRoll = new JetApp();
		letsRoll.run();
		letsRoll.userMenu(); 
	}

	public void run() {
		Airfield petersonAFB = new Airfield();
		petersonAFB.createJets();
		Jet[] petersonJets = petersonAFB.jetInventory;
	}

	public void listFleet() {
		System.out.println("Listing the fleet");
		petersonAFB.createJets();
		Jet[] petersonJets = petersonAFB.jetInventory;
		
		for (int i = 0; i < petersonJets.length; i++) {
			if (petersonJets[i] != null) {
				System.out.println("Model: " + petersonJets[i].getModel() +  " Speed: " + petersonJets[i].getSpeed() + " mph " + " Range: " + petersonJets[i].getRange() + " miles " + " Price: " + petersonJets[i].getPrice() + " Million");
			}
		}
	}

	public void userMenu() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Airfield!");
		System.out.println("Here are your options!");
		System.out.println("1 - List fleet");
		System.out.println("2 - Fly all jets");
		System.out.println("3 - View jet with the longest range");
		System.out.println("4 - Load all Cargo Jets");
		System.out.println("5 - Dogfight!");
		System.out.println("6 - Add a jet to the fleet");
		System.out.println("7 - Quit");
		System.out.print("Please make a choice here: >> ");
		
		int choice = scanner.nextInt();
		

		switch (choice) {
		case 1:
			listFleet();
			System.out.println("Press enter to continue...");
			try {        System.in.read(); }
			catch(Exception e){	e.printStackTrace();
			}
			//press Enter to continue 
			userMenu(); 
		case 2:
			Jet.fly();
			pressEnter(); 
			userMenu();
		case 3:
			viewLongestRange();
			pressEnter();
			userMenu();
		case 4:
//			loadCargoJets(); 
		case 5:
//			dogFight(); 
		case 6:
//			addJetToFleet(); 
		case 7:
			System.out.println("Thank you for visitng the Airfield!");
			break;
		default:
			userMenu(); 
		}
	}
		public void pressEnter() {
			System.out.println("Press enter to continue...");
			try {        System.in.read(); }
			catch(Exception e){	e.printStackTrace();
			}
		}
		
		public void viewLongestRange() {
			petersonAFB.createJets();
			Jet[] petersonJets = petersonAFB.jetInventory;
			
//			double max = petersonJets[i].getRange(); 
			
//			for (int i = 0; i < petersonJets.length; i++) {
//				if (petersonJets[i] != null) {
//					System.out.println("Model: " + petersonJets[i].getModel() +  " Speed: " + petersonJets[i].getSpeed() + " mph " + " Range: " + petersonJets[i].getRange() + " miles " + " Price: " + petersonJets[i].getPrice() + " Million");
//				}
//			}
			
			for (int i = 0; i < petersonJets.length; i++) {
				if (petersonJets[i] != null) {
					double max = petersonJets[i].getRange(); //evaluate the array 
					System.out.println(max);
					
						for (int counter = 1; counter < petersonJets.length; counter++)
						{
							double decMax = petersonJets[i].getRange(); 
							double max2 = decMax[0]; 
							if (decMax[counter] > max)
							{
								max = decMax[counter];
								System.out.println("The maximum range is : " + max);
							}
			         
//							double max = decMax[0];
//
//					        for (int counter = 1; counter < decMax.length; counter++)
//					        {
//					         if (decMax[counter] > max)
//					         {
//					          max = decMax[counter];
//					          System.out.println("The highest maximum for the December is: " + max);
//					         } 
					         
//					if (max < petersonJets[i].getRange()) {
//						max = petersonJets[i].getRange(); 
//						System.out.println(max);
//					}
//					else {
//						System.out.println("What's up doc?");
//					}
				}
			}
		}
				
				
//			
//	        max = a[0];
//	        for(int i = 0; i < n; i++)
//	        {
//	            if(max < a[i])
//	            {
//	                max = a[i];
//	            }
//	        }
//	        System.out.println("Maximum value:"+max);

		}
}

