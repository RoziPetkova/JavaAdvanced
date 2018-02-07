package e1013infernoInfinity;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import e1013infernoInfinity.repositories.Repository;
import e1013infernoInfinity.repositories.WeaponRepository;
import e1013infernoInfinity.repository.Weapon;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Repository<Weapon> weapons = new WeaponRepository<>();
		Runnable engine = new Engine(reader, weapons);
		
		engine.run();
	}
}
