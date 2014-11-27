package lab03;
//************************************************************
//Shapes.java
//
//The program will draw two filled rectangles and a
//filled oval.
//************************************************************
import javax.swing.JApplet;
import java.awt.*;
public class Shapes extends JApplet
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
x = 400;
y = 40;
width = 100;
height = 200;
//Draw the rectangle First one
page.fillRect(x, y, width, height);

//Draw the rectangle Second One
page.setColor (Color.green);
page.fillOval(40, y, 99, 100);

//Draw the Third One
page.setColor (Color.black);
page.fillOval(390, 30, 50, 50);

//Draw the Fourth One
page.setColor (Color.magenta);
page.fillRect(445, 44, 50, 50);
}
}