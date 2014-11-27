package ca.bcit.cst;

import java.util.Random;

public class Program {
    
    
    /* Write a test program that prompts for and reads in three 
    names and creates an account with an initial balance of $ 100 for each. 
    Print the three accounts, then close the first account and try to consolidate 
    the second and third into a new account. Now print the accounts again, including 
    the consolidated one if it was created.*/

    public static void main(String[] args)
    {
        double initialBalance = 100.00;
        Random rand = new Random();
        
        int acctNum1 = rand.nextInt(Integer.MAX_VALUE ) + 1;
        TrustAccount acct1 = new TrustAccount(initialBalance, "Jane Baker", acctNum1);
        
        int acctNum2 = rand.nextInt(Integer.MAX_VALUE ) + 1;
        TrustAccount acct2 = new TrustAccount(initialBalance, "John Taylor", acctNum2);
        
        int acctNum3 = rand.nextInt(Integer.MAX_VALUE ) + 1;
        TrustAccount acct3 = new TrustAccount(initialBalance, "Bob Plumber", acctNum3);
        
        System.out.println(acct1);
        System.out.println("========================================");
        System.out.println(acct2);
        System.out.println("========================================");
        System.out.println(acct3);
        acct1.close();
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        try {
        	/*
        	TrustAccount acct4 = TrustHelper.consolidate(acct2, acct3);
	        System.out.println("=== Final Accounts ===");
	        System.out.println();
	        System.out.println(acct1);
	        System.out.println("========================================");
	        System.out.println(acct2);
	        System.out.println("========================================");
	        System.out.println(acct3);
	        System.out.println("========================================");
	        System.out.println(acct4);
	        */
            int an1 = rand.nextInt(Integer.MAX_VALUE ) + 1;
            int an2 = rand.nextInt(Integer.MAX_VALUE ) + 1;
    		TrustAccount ta1 = new TrustAccount(100, "Owner1", an1);
    		TrustAccount ta2 = new TrustAccount(100, "Owner2", an2);
    		
    		TrustAccount ta3 = TrustHelper.consolidate(ta1, ta2);

        } catch (DuplicateAccountNumberException nmbrEx) {
        	System.out.println(nmbrEx.toString());
        } catch (DifferentAccountNameException nameEx) {
        	System.out.println(nameEx.toString());
        }        
    }
}
