package Lab11;

import java.awt.*;
import java.util.Random;

public class Circle {
    private int centerX, centerY;
    private int radius;
    private Color color;
    
    static Random generator = new Random();
    
    public Circle(Point point) {
        radius = Math.abs(generator.nextInt())%50 + 25;
        color = new Color(Math.abs(generator.nextInt())% 16777216);
        centerX = point.x;
        centerY = point.y;
    }
    
    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(centerX-radius, centerY-radius, radius*2, radius*2);
    }
    
    public void move(Point p) {
        centerX = p.x;
        centerY = p.y;
    }
    
    public boolean isInside(Point p) {
        double distance = Math.sqrt(Math.pow(p.x - centerX, 2) + Math.pow(p.y - centerY, 2));
        if (distance < radius) {
            return true;
        } else {
            return false;
        }
    }
}