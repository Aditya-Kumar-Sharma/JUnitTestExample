package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		JUnitTesting jUnit = new JUnitTesting();
		String result = jUnit.AddStrings("cod", "ing");
		assertEquals("coding", result);
	}

}
