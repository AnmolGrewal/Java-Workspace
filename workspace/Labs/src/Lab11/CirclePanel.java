package Lab11;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CirclePanel extends JPanel {
    private final int width = 600, height = 400;
    private Circle circle;
    
    public CirclePanel() {
        addMouseListener(new CirclesListener());
        setPreferredSize(new Dimension(width, height));
    }
    
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        if (circle != null) {
            circle.draw(page);
        }
    }
    
    private class CirclesListener implements MouseListener {
        public void mousePressed(MouseEvent event) {
            if (circle == null) {
                circle = new Circle(event.getPoint());
            } else {
                if (circle.isInside(event.getPoint())) {
                    circle = null;
                } else {
                    circle.move(event.getPoint());
                }
            }
            repaint();
        }
        
        public void mouseClicked(MouseEvent event) {}
        public void mouseReleased(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {
            setBackground(Color.white);
        }
        public void mouseExited(MouseEvent event) {
            setBackground(Color.blue);
        }
        
    }
}
