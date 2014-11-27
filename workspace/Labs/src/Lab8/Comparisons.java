package Lab8;

import java.util.Scanner;

public class Comparisons  
{  
 
public static void main(String args[])  
{  
 
System.out.println("Largest of abcd, defghi, ab is : "+Compare3.largest("abcd", "defghi","ab"));  
 
Scanner scan = new Scanner(System.in);  
 
System.out.println("Enter 3 Stringegers");  
 
System.out.println("Enter first Number :");  
 
String num1=scan.next();  
 
System.out.println("Enter second Number :");  
 
String num2=scan.next();  
 
System.out.println("Enter third Number :");  
 
String num3=scan.next();  
 
System.out.println("Largest of "+num1+", "+num2+", "+num3+" is : "+Compare3.largest(num1, num2,num3));  
 
 System.out.println("Enter 3 Numbers");  
  
 System.out.println("Enter first Number :");  
  
 int num4=scan.nextInt();  
  
 System.out.println("Enter second Number :");  
  
 int num5=scan.nextInt();  
  
 System.out.println("Enter third Number :");  
  
 int num6=scan.nextInt();  
  
 System.out.println("Largest of "+num4+", "+num5+", "+num6+" is : "+Compare3.largest(num4, num5,num6));  
  scan.close();
 }  
 
}
