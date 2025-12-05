package game.model;

public class Player {
	private String name;
	// Role of the player (Player-Role)
	private Role role;

	public Player(String name) {
		this.name = name;
		this.role = null;
	}

	public String getName() {
		return name;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	// The act() method that will be actually be called is determined at runtime (Player-Role)
	public void playTurn() {
		System.out.println(name + " is taking their turn...");
		if (role == null)
			System.out.println("-> no role assigned, skip turn");
		else
			role.act();
	}

}
