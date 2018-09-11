package com.skilldistillery.jets;

public class Airfield {

	private Jet[] jetInventory = new Jet[10];
	
	public Airfield() {
		createJets(); 
	}

	public void createJets() {

		jetInventory[0] = new FighterJet("F16", 1500, 2622, 19);
		jetInventory[1] = new FighterJet("F22", 1498, 1839, 339);
		jetInventory[2] = new FighterJet("F35", 1550, 1200, 95);
		jetInventory[3] = new CargoPlane("C130", 368, 2361, 30);
		jetInventory[4] = new CargoPlane("C5", 1550, 7273, 225);

	}

	public Jet[] getJetInventory() {
		return jetInventory;
	}

	public void setJetInventory(Jet[] jetInventory) {
		this.jetInventory = jetInventory;
	}
	
	public void addJet(Jet jet) {
		for (int i = 0; i < jetInventory.length; i++) {
			if (jetInventory[i]==null) {
				jetInventory[i]=jet; 
				break; 
			}
		}
	}
}
