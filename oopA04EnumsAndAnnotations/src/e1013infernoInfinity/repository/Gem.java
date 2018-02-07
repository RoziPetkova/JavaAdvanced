package e1013infernoInfinity.repository;

public enum Gem {
	RUBY(7, 2, 5), 
	EMERALD(1, 4, 9), 
	AMETHYST(2, 8, 4);
	
	private Gem(int a, int b, int c) {
		strength = a;
		agility = b;
		vitality = c;
	}
	
	private int strength;
	private int agility;
	private int vitality; 
	
	public int getAgility() {
		return agility;
	}
	public int getStrength() {
		return strength;
	}
	public int getVitality() {
		return vitality;
	}
}
