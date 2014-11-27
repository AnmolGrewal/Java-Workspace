package lab02;
//***********************************************
//BaseConvert.java
//
//Converts base 10 numbers to another base
//(at most 4 digits in the other base). The
//base 10 number and the base are input.
//***********************************************
import java.util.Scanner;
public class BaseConvert
{
public static void main (String[] args)
{
int base; // the new base
int base10Num; // the number in base 10
//in 4 digits in the new base
//read in the base 10 number and the base
System.out.println();
String baseBNum = new String (""); // the number in the new base
Scanner scan = new Scanner(System.in);
//INput base 10 number and base to be converted
System.out.println("Base Conversion Program");

System.out.print("Please enter a base(2-9): ");
base = scan.nextInt();
System.out.print("Please enter a base 10 number to convert: ");
base10Num = scan.nextInt();
double maxNumber= Math.pow(base,4)-1;

//Complete values
int spot0 = base10Num % base;
int Quotientspot0 = base10Num/base;
int spot1= Quotientspot0%base;
int Quotientspot1= Quotientspot0/base;
int spot2=Quotientspot1%base;
int Quotientspot2=Quotientspot1/base;
int spot3=Quotientspot2%base;
int Quotientspot3=Quotientspot2/base;

//Print results of base conversion
System.out.println("Your answer is: " + spot3 + "," + spot2 + "," + spot1 + "," + spot0 + " base " + base);
}
}
