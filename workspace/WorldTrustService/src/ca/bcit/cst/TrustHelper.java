package ca.bcit.cst;

import java.util.Random;

public class TrustHelper {
    public static TrustAccount consolidate(TrustAccount acct1, TrustAccount acct2)
    	throws DuplicateAccountNumberException, DifferentAccountNameException
    {
        String name1 = acct1.getName();
        String name2 = acct2.getName();
        long acct1Number = acct1.getNumber();
        long acct2Number = acct2.getNumber();
        
		if ((acct1Number == acct2Number)) {
			throw new DuplicateAccountNumberException();
		} else if(name1.equalsIgnoreCase(name2)) {
		    double newBalance = acct1.getBalance() + acct2.getBalance();
		    Random rand = new Random();
		    int acctNum = rand.nextInt(Integer.MAX_VALUE ) + 1;
		    TrustAccount acct3 = new TrustAccount(newBalance, name1, acctNum);
		    acct1.close();
		    acct2.close();
		    return acct3;
		
		} else {
		    throw new DifferentAccountNameException();
		}       
    }
}