package Lab6;
//****************************************... 
//PowersOf2.java 
//
//Print out as many powers of 2 as the user requests 
//
//****************************************... 
import java.util.Scanner; 

public class PowersOf2 
{ 
public static void main(String[] args) 
{ 
int numPowersOf2; //How many powers of 2 to compute 

//Exponent for current power of 2 
int exponent = 1; // 2 ^ 0 = 1 
final int START_VALUE = 1; // 2 ^ 1 = 2, etc 
Scanner scan = new Scanner(System.in); 

System.out.println("How many powers of 2 would you like printed?"); 
numPowersOf2 = scan.nextInt(); 

//print a message saying how many powers of 2 will be printed 
System.out.println ("Alright, here are the first " + numPowersOf2 + " powers of 2: "); 

for (int i=START_VALUE; i<=numPowersOf2; i++) { 
//find next power of 2 
exponent *= 2; 
//print out current power of 2 
System.out.println("2 ^ "+i+" = "+exponent); 
scan.close();
} 

} 
}