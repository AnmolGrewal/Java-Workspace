package Lab4;

import java.util.Scanner;

//*******************************************************
//Account.java
//
//A bank account class with methods to deposit to, withdraw from,
//change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
public class Account
{
private double balance;
private String name;
private long acctNum;
//---------------------------------------------
//Constructor -- initializes balance, owner, and account number
//--------------------------------------------
public Account(double initBal, String owner, long number)
{
balance = initBal;
name = owner;
acctNum = number;
}
//--------------------------------------------
//Checks to see if balance is sufficient for withdrawal.
//If so, decrements balance by amount; if not, prints message.
//--------------------------------------------
public double withdraw(double amount)
{
if (balance >= amount)
balance -= amount;
else
System.out.println("Insufficient funds");
return balance;
}
//--------------------------------------------
//Adds deposit amount to balance.
//--------------------------------------------
public double deposit(double amount)
{
balance += amount;
return balance;
}
//--------------------------------------------
//Returns balance.
//--------------------------------------------
public double getBalance()
{
return balance;
}
//--------------------------------------------
//Returns a string containing the name, account number, and balance.
//--------------------------------------------
public String toString()
{
	return ("Name: " + name + " Balance: " + balance + " Account Number" + acctNum);
}
//--------------------------------------------
//Deducts $10 service fee //
//--------------------------------------------
public double chargeFee()
{
	balance = balance - 10;
	return balance;
}
//--------------------------------------------
//Changes the name on the account
//--------------------------------------------
public void changeName(String newName)
{
	name = newName;
}
// RUN CODE
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
Account acct1, acct2;
//create account1 for Sally with $1000
acct1 = new Account(1000, "Sally", 1111);
//create account2 for Joe with $500
acct2 = new Account(500, "Joe", 2222);
//deposit $100 to Joe's account
acct2.deposit(100);
//print Joe's new balance (use getBalance())
System.out.println(acct2.balance);
//withdraw $50 from Sally's account
acct1.withdraw(50);
//print Sally's new balance (use getBalance())
acct1.getBalance();
System.out.println(acct1.balance);
//charge fees to both accounts
System.out.println(acct1.chargeFee());
System.out.println(acct2.chargeFee());
//change the name on Joe's account to Joseph
acct2.changeName("Joseph");
//print summary for both accounts
System.out.println(acct1);
System.out.println(acct2);
scan.close();
}
}