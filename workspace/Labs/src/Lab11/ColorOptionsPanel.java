package Lab11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorOptionsPanel extends JPanel {
    private final int width = 350, height = 100, font_size = 20;
    private final int num_colors = 5;
    private Color[] color = new Color[num_colors];
    private JLabel heading;
    private JRadioButton[] colorButton = new JRadioButton[num_colors];
    
    public ColorOptionsPanel() {
        heading = new JLabel("Choose the background color!");
        heading.setFont(new Font("Helvetica", Font.BOLD, font_size));
        
        color[0] = Color.yellow;
        color[1] = Color.cyan;
        color[2] = Color.red;
        color[3] = Color.green;
        color[4] = Color.magenta;
        
        //button group
        colorButton[0] = new JRadioButton("Yellow", true);
        colorButton[1] = new JRadioButton("Cyan");
        colorButton[2] = new JRadioButton("Red");
        colorButton[3] = new JRadioButton("Green");
        colorButton[4] = new JRadioButton("Magenta");
        
        add(heading);
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(width, height));
        
        ColorListener listener = new ColorListener();
        
        ButtonGroup colors = new ButtonGroup();
        
        for (JRadioButton color : colorButton) {
            colors.add(color);
            color.setBackground(Color.white);
            color.addActionListener(listener);
            add(color);
        }
    }
    
    private class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            for (int i = 0; i < colorButton.length; i++) {
                if (colorButton[i].isSelected()) {
                    setBackground(color[i]);
                }
            }
        }
    }
}