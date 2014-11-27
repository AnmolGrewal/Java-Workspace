package Lab4;

import java.util.Scanner;

public class IntWrapper {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter a number that you want to convert to Binary,Octal & Hex");
    	int x = scan.nextInt();
    	Integer user = new Integer(x);
        System.out.println("Binary Value: "+ Integer.toBinaryString(user));
        System.out.println("Octal value: " + Integer.toOctalString(user)); 
        System.out.println("Hex value: " + Integer.toHexString(user));   
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        System.out.println("Enter First Number");
        String usera = scan.next();
        
        System.out.println("Enter Second Number");
        String userb = scan.next();
        
        Double converta = Double.valueOf(usera);
        Double convertb = Double.valueOf(userb);
        
        double totalsum = converta + convertb;
        System.out.println("Total Sum is: " + totalsum);
        scan.close();
    }
}