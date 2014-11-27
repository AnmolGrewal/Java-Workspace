package Lab11;

import javax.swing.JFrame;

public class Circles2 {
    public static void main(String[] args) {
        JFrame circlesFrame = new JFrame("Circles");
        circlesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        circlesFrame.getContentPane().add(new CirclePanel2());
        
        circlesFrame.pack();
        circlesFrame.setVisible(true);
    }
}