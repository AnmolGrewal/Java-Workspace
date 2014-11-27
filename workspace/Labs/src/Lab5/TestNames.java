package Lab5;
import java.util.Scanner;

public class TestNames
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String firstName1 = new String();
        String middleName1 = new String();
        String lastName1 = new String();
        String firstName2 = new String();
        String middleName2 = new String();
        String lastName2 = new String();

        System.out.print("\nPlease enter a first name: ");
        firstName1 = scan.nextLine();
        System.out.print("Please enter a middle name: ");
        middleName1 = scan.nextLine();
        System.out.print("Please enter a last name: ");
        lastName1 = scan.nextLine();
        Name name1 = new Name(firstName1, middleName1, lastName1);

        System.out.print("\nPlease enter another first name: ");
        firstName2 = scan.nextLine();
        System.out.print("Please enter another middle name: ");
        middleName2 = scan.nextLine();
        System.out.print("Please enter another last name: ");
        lastName2 = scan.nextLine();
        Name name2 = new Name(firstName2, middleName2, lastName2);
        scan.close();
        
        System.out.println();
        System.out.println(name1.firstMiddleLast());
        System.out.println(name2.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name2.initials());
        System.out.println(name1.length());
        System.out.println(name2.length());
        
        boolean equals1 = firstName1.equalsIgnoreCase(firstName2);
        boolean equals2 = middleName1.equalsIgnoreCase(middleName2);
        boolean equals3 = lastName1.equalsIgnoreCase(lastName2);
        if(equals1 == true && equals2 == true && equals3 == true) {
        	System.out.println("The names are the same");
        } else {
        	System.out.println("The names are not the same");
        }
    }
}
