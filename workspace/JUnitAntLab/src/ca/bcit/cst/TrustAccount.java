package ca.bcit.cst;

import java.util.Random;

//************************************************************
//TrustAccount.java
//
//A bank account class with methods to deposit to, withdraw from,
//change the name on, and get a String representation
//of the account.
//************************************************************
public class TrustAccount
{
    public static int numAccounts = 0;
    private double balance;
    private String name;
    private long acctNum;
    //-------------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //-------------------------------------------------
    public TrustAccount(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    
    public TrustAccount (double initBal, String owner) 
    {
        numAccounts++;
        balance = initBal;
        name = owner;
        Random rand = new Random();
        acctNum = rand.nextInt(Integer.MAX_VALUE ) + 1;
    }

    public TrustAccount (String owner) 
    {
        balance = 0;
        name = owner;
        Random rand = new Random();
        acctNum = rand.nextInt(Integer.MAX_VALUE ) + 1;
    }
    
    //-------------------------------------------------
    //Checks to see if balance is sufficient for withdrawal.
    //If so, decrements balance by amount; if not, prints message.
    //-------------------------------------------------
    public void withdraw(double amount) throws InsufficientFunds
    {
        if (balance >= amount)
            balance -= amount;
        else
            throw new InsufficientFunds();
    }
    
    public void withdraw(double amount, double fee) throws InsufficientFunds
    {
        if (balance >= amount + fee)
            balance -= amount + fee;
        else
        	throw new InsufficientFunds();
    }    
    
    //-------------------------------------------------
    //Adds deposit amount to balance.
    //-------------------------------------------------

    public void deposit(double amount)
    {
        balance += amount;
    }
    //-------------------------------------------------
    // Returns balance.
    //-------------------------------------------------
    public double getBalance()
    {
        return balance;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public long getNumber() 
    {
        return acctNum;
    }
    
    public static int getNumAccounts() {
        
        return numAccounts;
    }
    
    public void close() 
    {
        balance = 0;
        name = "CLOSED";
        numAccounts--;
    }
    
    //-------------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //-------------------------------------------------
    public String toString()
    {
        return "Name:" + name +
                "\nAccount Number: " + acctNum +
                "\nBalance: " + balance;
    }
}