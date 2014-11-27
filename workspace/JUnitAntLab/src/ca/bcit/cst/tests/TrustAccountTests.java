package ca.bcit.cst.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ca.bcit.cst.InsufficientFunds;
import ca.bcit.cst.TrustAccount;

public class TrustAccountTests {

	TrustAccount bob;
	double indicator = 0.001;
	@Test
	@Category(TrustTestsCategory.class)
	public void NameTest() {
		bob = new TrustAccount ("bob");
		double checkbalance = bob.getBalance();
		double Expectedbalance = 1;
		assertEquals(Expectedbalance, checkbalance , indicator);
	}
	@Test
	@Category(TrustTestsCategory.class)
	public void depositTest(){
		bob = new TrustAccount ("bob");
		bob.deposit(100.50);
		double checkbalance = bob.getBalance();
		double Expectedbalance = 100.50;
		assertEquals(Expectedbalance, checkbalance , indicator);
	}
	@Test(expected = InsufficientFunds.class)
	@Category(TrustTestsCategory.class)
	public void withdrawTest() throws InsufficientFunds{
		bob = new TrustAccount ("bob");
		bob.withdraw(100);
	}
	
	@Test
	public void withdrawTest2() throws InsufficientFunds{
		bob = new TrustAccount (200, "bob");
		bob.withdraw(100, 10);
		double checkbalance = bob.getBalance();
		double Expectedbalance = 90;
		assertEquals(Expectedbalance, checkbalance , indicator);
	}
	
	@Test
	public void closeTest(){
		bob = new TrustAccount (200, "bob");
		bob.close();
		double checkbalance = bob.getBalance();
		double Expectedbalance = 0;
		assertEquals(Expectedbalance, checkbalance , indicator);
	}
}
