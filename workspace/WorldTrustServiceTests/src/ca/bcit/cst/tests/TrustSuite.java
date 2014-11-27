package ca.bcit.cst.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TrustHelperTests.class, 
	TrustAccountTests.class
})

public class TrustSuite {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
