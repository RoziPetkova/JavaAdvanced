package oopA06UnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab.Axe;
import lab.Dummy;

public class DummyTests {
	private Axe axe;
	private Dummy dummy;

	@Before
	public void before() {
		axe = new Axe(1, 10);
		dummy = new Dummy(1, 2);
	}

	@Test
	public void losesHealthProperly() {
		// Act
		axe.attack(dummy);
		// Assert
		Assert.assertEquals("Dummy don't lose health", 0, dummy.getHealth());
	}

	@Test(expected = IllegalStateException.class)
	public void deadDummyThrowsExcepton() {
		// Act
		axe.attack(dummy);	
		axe.attack(dummy);	
	}
	

	@Test(expected = IllegalStateException.class)
	public void aliveDummyCantGiveXP() {
		// Act	
		dummy.giveExperience();
	}
	

	@Test()
	public void deadDummyCanGiveXP() {
		// Act
		axe.attack(dummy);
		dummy.giveExperience();
		//Assert
		Assert.assertEquals("Dummy gives XP", 2, dummy.giveExperience());
	}

}
