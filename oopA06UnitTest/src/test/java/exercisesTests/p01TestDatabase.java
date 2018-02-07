package exercisesTests;

import org.junit.Assert;
import org.junit.Test;
import exercises.Database;

public class p01TestDatabase {
	Database dataBase = new Database();

	@Test
	public void testAddMethos() {
		// Arrange
		// Database data = new Database();
		// Act
		dataBase.add(12);
		dataBase.add(15);
		// Assert
		Assert.assertEquals("AddMethod doont work prorerly", 2, dataBase.getintegers().size());
	}
	
	@Test
	public void testRemoveMethos() {
		// Arrange
		// Database data = new Database();
		// Act
		dataBase.add(12);
		dataBase.add(15);
		// Assert
		Assert.assertEquals("AddMethod doont work prorerly", 2, dataBase.getintegers().size());
	}
	
	@Test
	public void testGetMethos() {
		// Arrange
		// Database data = new Database();
		// Act
		dataBase.add(12);
		dataBase.add(15);
		// Assert
		Assert.assertEquals("AddMethod doont work prorerly", 2, dataBase.getintegers().size());
	}
}
