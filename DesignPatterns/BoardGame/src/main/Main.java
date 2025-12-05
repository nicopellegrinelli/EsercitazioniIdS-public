package main;

import java.util.Arrays;

import game.engine.*;
import game.model.Player;
import game.model.WarriorRole;
import game.model.WizardRole;

public class Main {

	public static void main(String[] args) {
		Player p1 = new Player("player1");
		p1.setRole(new WarriorRole(10));
		Player p2 = new Player("player2");
		
		// Impossible, GameEngine constructor is private (Singleton)
		// GameEngine ge = new GameEngine();
		
		GameEngine.getInstance().addPlayer(p1);
		GameEngine.getInstance().addPlayer(p2);
		
		GameEngine ge = GameEngine.getInstance();
		
		ge.startGame();
		
		ge.nextTurn();
		
		// We can change the role of p1 at runtime (Player-Role)
		p1.setRole(new WizardRole(Arrays.asList(new String[] {"spell1", "spell2"})));
		
		ge.nextTurn();
		
		// Impossible, GameConfiguration set methods are package-private (Read-Only Interface)
		// GameConfiguration gm = (GameConfiguration) ge.getConfiguration();
		// gm.setMaxPlayer(0);
		
		GameConfigurationReadOnly gm = ge.getConfiguration();
		System.out.println("Max players: " + gm.getMaxPlayers());
	}

}
