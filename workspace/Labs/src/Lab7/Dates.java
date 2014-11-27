package Lab7;
//************************************************************
//Dates.java
//
//Determine whether a 2nd-millenium date entered by the user
//is valid
//************************************************************
import java.util.Scanner;
public class Dates
{
public static void main(String[] args)
{
int month, day, year; //date read in from user
int daysInMonth; //number of days in month read in
boolean monthValid, yearValid, dayValid; //true if input from user is valid
boolean leapYear; //true if user's year is a leap year
Scanner scan = new Scanner(System.in);
//Get integer month, day, and year from user
System.out.println("Enter Day");
day = scan.nextInt();
System.out.println("Enter Month");
month = scan.nextInt();
System.out.println("Enter Year");
year = scan.nextInt();
//Check to see if month is valid
if(month >= 1 && month <= 12){
	monthValid = true;
}else{
	monthValid = false;
}
//Check to see if year is valid
if(year >= 1000 && year <= 1999){
	yearValid = true;
}else{
	yearValid = false;
}
//Determine whether it's a leap year
if (( year % 400 == 0) || ( year % 4 == 0 && year % 100 != 0 )){
	leapYear = true;
}else{
	leapYear = false;
}
//Determine number of days in month
if (monthValid == false)
    daysInMonth = 0;
else if ( month == 2 )
{
    if(leapYear == true){
        daysInMonth = 29;
    }
    else{
        daysInMonth = 28;           
    }
}
else if (month == 4 || month == 6 || month == 9 || month == 11){
    daysInMonth = 30;
}
else{
    daysInMonth = 31;
}
//User number of days in month to check to see if day is valid
if(day > 0 && day <= daysInMonth){
	dayValid = true;
}else{
	dayValid = false;
}
//Determine whether date is valid and print appropriate message
if(dayValid = true && monthValid == true && yearValid == true){
	System.out.println("Date is valid");
	if(leapYear = true){
		System.out.println("It is a leap year");
	}else{
		System.out.println("There is no leap year");
	}
}else{
	System.out.println("Date is not valid");
}
}
}