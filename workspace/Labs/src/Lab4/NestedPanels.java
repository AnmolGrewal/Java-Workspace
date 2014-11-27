package Lab4;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates a basic component hierarchy.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class NestedPanels {
    /**
     * Presents two colored panels nested within a third.
     * @param args unused
     */
    public static void main(String[] args) {
        final int panelWidth = 150;
        final int panelHeight = 100;
        JFrame frame = new JFrame("Nested Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set up first subpanel
        JPanel subPanel1 = new JPanel();
        subPanel1.setPreferredSize(new Dimension(panelWidth, panelHeight));
        subPanel1.setBackground(Color.green);
        JLabel label1 = new JLabel("One");
        subPanel1.add(label1);

        // Set up second subpanel
        JPanel subPanel2 = new JPanel();
        subPanel2.setPreferredSize(new Dimension(panelWidth, panelHeight));
        subPanel2.setBackground(Color.red);
        JLabel label2 = new JLabel("Two");
        subPanel2.add(label2);
        
        // Set up third subpanel
        JPanel subPanel3 = new JPanel();
        subPanel3.setPreferredSize(new Dimension(300, panelHeight));
        subPanel3.setBackground(Color.black);
        JLabel label3 = new JLabel("Three");
        subPanel3.add(label3);
        
        // Set up fourth subpanel
        JPanel subMyPanels = new JPanel();
        subMyPanels.setPreferredSize(new Dimension(320, 20));
        subMyPanels.setBackground(Color.blue);
        JLabel MyPanels = new JLabel("My Panels");
        subMyPanels.add(MyPanels);

        // Set up primary panel
        JPanel primary = new JPanel();
        primary.setBackground(Color.blue);
        primary.setPreferredSize(new Dimension(320, 20));
        primary.add(MyPanels);
        primary.add(subPanel1);
        primary.add(subPanel2);
        primary.add(subPanel3);

        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }
}