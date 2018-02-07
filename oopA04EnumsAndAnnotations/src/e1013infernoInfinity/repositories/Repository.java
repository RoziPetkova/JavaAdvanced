package e1013infernoInfinity.repositories;

import java.util.Map;

public interface Repository<T> {

	Map<String, T> getAllWeapons();
	void add(T element);
	void remove(T element);
}
