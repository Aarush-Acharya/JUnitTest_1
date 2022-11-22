package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions Junit = new jUnitFunctions();
		String result = Junit.addStrings("abc", "cdf");
		assertEquals("abccdf", result);
	}

}
