package game.engine;

import java.util.ArrayList;
import java.util.List;

import game.model.Player;

public class GameEngine {
	// Private instance (Singleton)
	private static GameEngine instance;
	// Private instance of GameConfiguration (Read-Only Interface)
	private GameConfiguration configuration;
	
	private List<Player> players = new ArrayList<>();

	// Private constructor (Singleton)
	private GameEngine() {
		configuration = new GameConfiguration();
		// We can use set methods
		configuration.setBoardSize(8);
		configuration.setMaxPlayer(4);
	}
	
	// Public methods for creating or getting the instance (Singleton)
	public static GameEngine getInstance() {
		if (instance == null)
			instance = new GameEngine();
		return instance;
	}

	public void addPlayer(Player p) {
		if (players.size() >= configuration.getMaxPlayers())
            System.out.println("Cannot add player " + p.getName() + ": max players reached.");
        else
        	players.add(p);
	}

	public void startGame() {
		System.out.println("Game started with players: " + players.size());
	}

	public void nextTurn() {
		for (Player p : players) {
			p.playTurn();
		}
	}

	// Return the configuration as GameConfigurationReadOnly (Read-Only Interface)
	public GameConfigurationReadOnly getConfiguration() {
		return configuration;
	}
}
