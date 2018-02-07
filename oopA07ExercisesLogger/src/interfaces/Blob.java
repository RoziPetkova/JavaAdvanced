package interfaces;

import observers.Observer;

public interface Blob {

	void attack(Blob target);

	int getDamage();

	void setDamage(int i);

	int getHealth();

	void setHealth(int i);

	String getName();

	Behavior getBehavior();

	void attach(Observer observer);

	void update();
}
