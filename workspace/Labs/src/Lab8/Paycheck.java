package Lab8;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Paycheck {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String employee = JOptionPane.showInputDialog (null, "Enter employee's name");
      
      System.out.println("Enter number of hours worked:");
      double  hours = scan.nextDouble();
 
      System.out.println("Enter hourly pay rate:");
      double  pay = scan.nextDouble();
 
      double  gross_pay = pay * hours;
      
      double overtime = 0;
      if(hours > 40){
    	  overtime = hours - 40;
    	  overtime *= (pay*1.5);
      }
      else{
    	  overtime = 0;
      }
      double total_pay = gross_pay + overtime;
      
      JOptionPane.showMessageDialog (null, "Employee name: " + employee);
      JOptionPane.showMessageDialog (null, "Hours worked: " + hours);
      JOptionPane.showMessageDialog (null, "Payrate: " + pay);
      JOptionPane.showMessageDialog (null, "Overtime Money: " + overtime);
      JOptionPane.showMessageDialog (null, "Gross pay: " + total_pay);
      scan.close();
      
   }
}