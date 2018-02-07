package oopA06UnitTest;


import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

public class TestMyTests {

	@Test
	public void testDummyFirstMethod() throws NoSuchMethodException, SecurityException {
		
		Class<DummyTests> dummyClass = DummyTests.class;
		Method firstMethos = dummyClass.getMethod("losesHealthProperly");
		Assert.assertTrue("No such method!", firstMethos != null);
	}
}
