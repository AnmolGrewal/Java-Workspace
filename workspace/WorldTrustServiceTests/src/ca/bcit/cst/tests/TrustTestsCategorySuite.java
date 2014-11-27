package ca.bcit.cst.tests;

import org.junit.runners.Suite;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
@RunWith(Categories.class)
@IncludeCategory(TrustTestsCategory.class)
@Suite.SuiteClasses({
	TrustHelperTests.class, 
	TrustAccountTests.class
})
public class TrustTestsCategorySuite {

	@Test
	public void test() {
	}

}
