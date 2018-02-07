package oopA06UnitTest;

import org.junit.Assert;
import org.junit.Test;

import lab.Axe;
import lab.Dummy;

public class AxeTests {

	@Test
	public void axeLosesDurability() {
		// Arrange
		Axe axe = new Axe(5,  10);
		Dummy dummy = new Dummy(10, 0);
		// Act
		axe.attack(dummy);
		// Assert
		Assert.assertEquals("Wrong level of durability", 9, axe.getDurabilityPoints());

	}
	
	@Test(expected = IllegalStateException.class)
	public void attackWithBrokenAxe() {
		// Arrange
		Axe axe = new Axe(5,  0);
		Dummy dummy = new Dummy(10, 0);
		// Act
		axe.attack(dummy);
	}
}
