package game.engine;

public class GameConfiguration implements GameConfigurationReadOnly{
	private int maxPlayers;
	private int boardSize;
	
	GameConfiguration() {} // package-private

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public int getBoardSize() {
		return boardSize;
	}

	// Package visibility => only classes in game.engine (e.g. GameEngine) can call this method (Read-Only Interface)
	void setMaxPlayer(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	// Package visibility => only classes in game.engine (e.g. GameEngine) can call this method (Read-Only Interface)
	void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

}
