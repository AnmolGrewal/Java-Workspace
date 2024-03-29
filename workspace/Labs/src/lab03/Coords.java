package lab03;
//*************************************************************
//Coords.java
//
//Draw rectangles to illustrate the Java coordinate system
//
//*************************************************************
import javax.swing.JApplet;

import java.awt.*;
public class Coords extends JApplet
{
public void paint (Graphics page)
{
//Declare size constants
final int MAX_SIZE = 300;
final int PAGE_WIDTH = 600;
final int PAGE_HEIGHT = 400;
//Declare variables
int x, y; // x and y coordinates of upper left-corner of each shape
int width, height; // width and height of each shape
//Set the background color
setBackground (Color.yellow);
//Set the color for the next shape to be drawn
page.setColor (Color.blue);
//Assign the corner point and width and height
x = 300;
y = 200;
width = 150;
height = 100;
//First Rectangle
page.fillRect(x, y, width, height);

//Draw the rectangle Second One
page.setColor (Color.green);
page.fillRect(0, 0, width, height);

//Draw the Third One
page.setColor (Color.black);
page.fillRect(600, 0, width, height);

//Draw the Fourth One
page.setColor (Color.magenta);
page.fillRect(0, 400, width, height);

page.setColor (Color.red);
page.fillRect(600, 400, width, height);
}
}