package com.skilldistillery.jets;

import java.util.Arrays;

public class Airfield {
	Jet[] jetInventory = new Jet[10]; 
	
	public void createJets() {
		
	jetInventory[0]=new FighterJet("F16",1500,2622,19);
	jetInventory[1]=new FighterJet("F22",1498,1839,339);
	jetInventory[2]=new FighterJet("F35",1550,1200,95);
	jetInventory[3]=new CargoPlane("C130",368,2361,30);
	jetInventory[4]=new CargoPlane("C5",1550,7273,225);
//	jetInventory[5]=new FighterJet("C5",1550,7273,225);
//	jetInventory[6]=new FighterJet("C5",1550,7273,225);
//	jetInventory[7]=new FighterJet("C5",1550,7273,225);
//	jetInventory[8]=new FighterJet("C5",1550,7273,225);
//	jetInventory[9]=new FighterJet("C5",1550,7273,225);
	}

	
	
}
