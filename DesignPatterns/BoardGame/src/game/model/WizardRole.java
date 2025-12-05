package game.model;

import java.util.List;

public class WizardRole implements Role {
	private List<String> spells;

	public WizardRole(List<String> spells) {
		this.spells = spells;
	}
	
	
	@Override
	// playTurn is moved in Player, where act() is called (Player-Role)
	public void act() {
		for (String spell: spells)
			System.out.println("-> casting spell " + spell);
	}

}
