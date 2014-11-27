package lab02;
import java.util.Scanner;
//************************************************************
//Circle.java
//
//Print the area of a circle with two different radii
//************************************************************
public class CircleScan
{
public static void main(String[] args)
{
	System.out.println("Enter the radius for the circle whole numbers only");
Scanner scan = new Scanner(System.in);
int radius1 = scan.nextInt();
scan.close();
final double PI = 3.14159;
double area1 = PI * radius1 * radius1;
double Circumference1 = (2 * PI * radius1);
System.out.println("The area of a circle with radius " + radius1 +
" is " + area1);
System.out.println("The Circumference is: " + Circumference1);
int radius2 = radius1 * 2;
double area2;
area2 = PI * radius2 * radius2;
double Circumference2 = (2 * PI * radius2);
System.out.println("The area of a circle with radius " + radius2 +
" is " + area2);
System.out.println("The Circumference is: " + Circumference2);
double Area = area2 / area1;
System.out.println("The Change in Area " + Area);
double Circumference = Circumference2 / Circumference1;
System.out.println("The Change in Circumference is: " + Circumference);
}
}