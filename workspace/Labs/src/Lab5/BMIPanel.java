package Lab5;
//********************************************************************
//BMIPanel.java     
//
//Computes body mass index in a GUI.
//********************************************************************

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BMIPanel extends JPanel
{
private int WIDTH = 300;
private int HEIGHT = 120;

private JLabel heightLabel, weightLabel, BMILabel, resultLabel;
private JTextField height, weight;
private JButton calculate;

//-------------------------------------------------------
//  Sets up the GUI.
//-------------------------------------------------------
public BMIPanel()
{
   //create labels for the height and weight textfields 
   heightLabel = new JLabel ("Your height in inches:");
   weightLabel = new JLabel ("Your weight in pounds: ");

   //create the "This is your BMI" label
   BMILabel = new JLabel ("This is your BMI");
   //create the result label to hold the BMI value
   resultLabel = new JLabel ("---");
   //create the JTextField to hold the person's height in inches
   //create the JTextField to hold the person's weight in pounds

   //create the button to press to calculate BMI
   calculate = new JButton();
   //create a BMIListener and make it listen for the button to be pressed
   calculate.addActionListener(new BMIListener());

   final int inputWidth = 5;
   height = new JTextField(inputWidth);
   weight = new JTextField(inputWidth);
   //add the height label and height textfield to the panel
   add(heightLabel);
   add(height);
   //add the weight label and weight textfield to the panel
   add(weightLabel);
   add(weight);
   //add the button to the panel
   add(calculate);
   //add the BMI label to the panel
   add(BMILabel);
   //add the label that holds the result to the panel
   add(resultLabel);
   //set panel size and color
   final int panelWidth = 300;
   final int panelHeight = 75;
   setPreferredSize (new Dimension(panelWidth, panelHeight));
   setBackground (Color.yellow);
}

//*****************************************************************
//  Represents an action listener for the calculate button.
//*****************************************************************
private class BMIListener implements ActionListener
{
//--------------------------------------------------------------
//  Compute the BMI when the button is pressed
//--------------------------------------------------------------
public void actionPerformed (ActionEvent event)
{
    String heightText, weightText;
    int heightVal, weightVal;
    double bmi;
    
    
    // get the text from the height and weight textfields
    heightText = height.getText();
    weightText = weight.getText();
    // Use Integer.parseInt to convert the text to integer values
    heightVal = Integer.parseInt(heightText);
    weightVal = Integer.parseInt(weightText);
    // Calculate the bmi = 703 * weight in pounds / (height in inches)^2
    bmi = (703 * weightVal) / (heightVal * heightVal);
    // Be sure your calculation is in double precision arithmetic

    //Put result in result label.  Use Double.toString to convert double to string.
    resultLabel.setText(Double.toString(bmi));
}
}
}