package ca.bcit.cst.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ca.bcit.cst.DifferentAccountNameException;
import ca.bcit.cst.DuplicateAccountNumberException;
import ca.bcit.cst.InsufficientFunds;
import ca.bcit.cst.TrustAccount;
import ca.bcit.cst.TrustHelper;

public class TrustHelperTests {
	TrustAccount bob, bob1, bob3;
	double indicator = 0.001;
	
	@Test
	@Category(TrustTestsCategory.class)
	public void samename() throws DuplicateAccountNumberException, DifferentAccountNameException {
		bob = new TrustAccount ("bob");
		bob1 = new TrustAccount ("bob");

		bob3 = TrustHelper.consolidate(bob , bob1);
		assertEquals(bob3.getName() , "bob");
	}
	
	@Test
	@Category(TrustTestsCategory.class)
	public void AddBalance() throws DuplicateAccountNumberException, DifferentAccountNameException {
		bob = new TrustAccount (100, "bob");
		bob1 = new TrustAccount (200, "bob");

		bob3 = TrustHelper.consolidate(bob , bob1);
		assertEquals(300, bob3.getBalance(), 0);
	}

	@Test (expected = DifferentAccountNameException.class)
	public void DifferentName() throws DuplicateAccountNumberException, DifferentAccountNameException {
		bob = new TrustAccount (0, "bob" , 1);
		bob1 = new TrustAccount (0, "bob2", 2);

		bob3 = TrustHelper.consolidate(bob , bob1);
	}
	
	@Test (expected = DuplicateAccountNumberException.class)
	public void AccountNumber() throws DuplicateAccountNumberException, DifferentAccountNameException {
		bob = new TrustAccount (0, "bob" , 1);
		bob1 = new TrustAccount (0, "bob", 1);

		bob3 = TrustHelper.consolidate(bob , bob1);
	}
}
