package game.model;

public class WarriorRole implements Role{
	private int damage;

	public WarriorRole(int damage) {
		this.damage = damage;
	}
	

	@Override
	// playTurn is moved in Player (Player-Role)
	public void act() {
		System.out.println("-> dealing " + this.damage + " damage ");
	}

}
