package e1013infernoInfinity.repository;

public enum WeaponTypes {
	AXE (5, 10 , 4 ),
	SWORD (4, 6 , 3 ),
	KNIFE (3, 4 , 2 );

	private WeaponTypes(int min, int max, int numbSockets) {
		initialMinDamage = min;
		initialMaxDamage = max; 
		sockets = new Gem[numbSockets]; 
	}
	
	int initialMinDamage; 
	int initialMaxDamage;
	Gem[] sockets;
	
	public Gem[] getSockets() {
		return sockets;
	}
	
	public int getInitialMaxDamage() {
		return initialMaxDamage;
	}
	
	public int getInitialMinDamage() {
		return initialMinDamage;
	}
}
