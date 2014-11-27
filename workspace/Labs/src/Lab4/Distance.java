package Lab4;
//************************************************************
//Distance.java
//
//Computes the distance between two points
//************************************************************
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Distance
{
public static void main (String[] args)
{
double x1, y1, x2, y2; // coordinates of two points
double distance; // distance between the points
Scanner scan = new Scanner(System.in);
//Read in the two points
System.out.print ("Enter the coordinates of the first point " +
"(put a space between them): ");
x1 = scan.nextDouble();
y1 = scan.nextDouble();
System.out.print ("Enter the coordinates of the second point: ");
x2 = scan.nextDouble();
y2 = scan.nextDouble();
//Compute the distance
double answer1 = (x1-x2);
answer1 = answer1 * answer1;
double answer2 = (y1-y2);
answer2 = answer2 * answer2;
distance = Math.sqrt(answer1 + answer2);
//Print out the answer
System.out.println("The answer is: " + distance);
scan.close();
}
}