package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		JUnitTesting jUnit = new JUnitTesting();
		int result = jUnit.AddNumbers(50, 100);
		assertEquals(150, result);
	}

}
