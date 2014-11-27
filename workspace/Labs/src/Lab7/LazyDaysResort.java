package Lab7;

import java.util.Scanner;

public class LazyDaysResort
{
    public static void main (String[] args)
    {
        int temp;
        Scanner scan = new Scanner(System.in);

        System.out.println ("What's the current temperature?");
        temp = scan.nextInt();
        if (temp > 95 || temp < 20)
        {
            System.out.println ("Visit our shops");
        }else if(temp >= 80){
        	System.out.println("Swimming");
        }else if(60 <= temp && temp < 80){
        	System.out.println("Tenis");
        }else if(40 <= temp && temp < 60){
        	System.out.println("Golf");
        }else if(temp < 40){
        	System.out.println("Skiing");
        }
        
        
        scan.close();
    }
}