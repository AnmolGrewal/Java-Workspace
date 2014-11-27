package lab02;
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
public class Paint
{
public static void main(String[] args)
{
final int COVERAGE = 350; //paint covers 350 sq ft/gal
//declare integers length, width, and height;
int length,width,height;
//declare double totalSqFt;
double totalSqFt;
//declare double paintNeeded;
double paintNeeded;
//declare and initialize Scanner object
Scanner scan = new Scanner(System.in);
//Prompt for and read in the length of the room
System.out.println("Input total length");
length = scan.nextInt();
//Prompt for and read in the width of the room
System.out.println("Input total width");
width = scan.nextInt();
//Prompt for and read in the height of the room
System.out.println("Input total height");
height = scan.nextInt();
// Doors and windows
System.out.println("How many windows do you have: ");
int windows = scan.nextInt();
System.out.println("How many doors do you have: ");
int doors = scan.nextInt();
scan.close();
//Compute the total square feet to be painted--think
totalSqFt = length * width * height;
//about the dimensions of each wall
//Compute the amount of paint needed
doors *= 20;
windows *= 15;
totalSqFt -= doors;
totalSqFt -= windows;
paintNeeded = totalSqFt / COVERAGE;
//Print the length, width, and height of the room and the
System.out.println("The length of the room is: " + length);
System.out.println("The width of the room is: " + width);
System.out.println("The height of the room is: " + height);
System.out.println("The total square feet is: " + totalSqFt);
//number of gallons of paint needed.
System.out.println("The number of gallons of paint needed is: " + paintNeeded);
}
}