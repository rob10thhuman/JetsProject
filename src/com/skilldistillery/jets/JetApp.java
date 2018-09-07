package com.skilldistillery.jets;

public class JetApp {

	public static void main(String[] args) {
		JetApp letsRoll = new JetApp(); 
		letsRoll.run(); 
	}
	
	private void run() {
		Airfield petersonAFB = new Airfield(); 
		petersonAFB.createJets();
		Jet[] petersonJets = petersonAFB.jetInventory; 
		
		for (int i = 0; i < petersonJets.length; i++) {
			if(petersonJets[i]!= null) {
				System.out.println(petersonJets[i].getModel());
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
		
		
		System.out.println("Test!");
		
	}
	
}
