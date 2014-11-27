package Lab5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class VoteCounterPanel extends JPanel
{
private int votesForJoe;
private JButton joe;
private JLabel labelJoe;

private int votesForSam;
private JButton sam;
private JLabel labelSam;

private JLabel Winning;
//----------------------------------------------
// Constructor: Sets up the GUI.
//----------------------------------------------
public VoteCounterPanel()
{
votesForJoe = 0;
votesForSam = 0;

joe = new JButton("Vote for Joe");
joe.addActionListener(new JoeButtonListener());
sam = new JButton("vote for Sam");
sam.addActionListener(new SamButtonListener());

labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
labelSam = new JLabel("Votes for Sam: " + votesForSam);
Winning = new JLabel("Votes for Joe: " + votesForJoe);

add(joe);
add(labelJoe);
add(sam);
add(labelSam);
add(Winning);
setPreferredSize(new Dimension(300, 120));
setBackground(Color.cyan);
}
//***************************************************
// Represents a listener for button push (action) events
//***************************************************
private class JoeButtonListener implements ActionListener
{
//----------------------------------------------
// Updates the counter and label when Vote for Joe
// button is pushed
//----------------------------------------------
public void actionPerformed(ActionEvent event)
{
votesForJoe++;
labelJoe.setText("Votes for Joe: " + votesForJoe);

if (votesForJoe<votesForSam){
Winning.setText("Who is whinning: Sam");
}
if (votesForJoe>votesForSam){
Winning.setText("Who is whinning: Joe");
}
if (votesForJoe==votesForSam){
Winning.setText("It´s a tie between Sam & Joe");
}
}
}
private class SamButtonListener implements ActionListener
{
//----------------------------------------------
// Updates the counter and label when Vote for Joe
// button is pushed
//----------------------------------------------
public void actionPerformed(ActionEvent event)
{
if(event.getSource()==sam)
votesForSam++;
labelSam.setText("Votes for Sam: " + votesForSam);

if (votesForJoe<votesForSam){
Winning.setText("Who is whinning: Sam");
}
if (votesForJoe>votesForSam){
Winning.setText("Who is whinning: Joe");
}
if (votesForJoe==votesForSam){
Winning.setText("It´s a tie between Sam & Joe");
}
}
}

}






