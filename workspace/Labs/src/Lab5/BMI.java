package Lab5;
//**************************************************************
//BMI.java
//
//Creates a GUI to compute a person's Body Mass Index. 
//**************************************************************

import javax.swing.JFrame;

public class BMI
{
 //-------------------------------------------------------
 // Creates and displays the BMI calculator GUI.
 //-------------------------------------------------------
 public static void main(String[] args)
 {
	JFrame frame = new JFrame ("BMI Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	BMIPanel panel = new BMIPanel();

	frame.getContentPane().add(panel);
	frame.pack();
	frame.setVisible(true);
 }
}
