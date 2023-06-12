/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.trident.centurycinema.ticket_seller.reservation_panels;

/**
 *
 * @author dagim
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ColoredCircle extends JComponent {
     private Color color;
    private int diameter;
    
    public ColoredCircle(Color color, int diameter) {
        this.color = color;
        this.diameter = diameter;
        setPreferredSize(new Dimension(diameter, diameter));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        
        int x = (width - diameter) / 2;
        int y = (height - diameter) / 2;
        
        g.setColor(color);
        g.fillOval(x, y, diameter, diameter);
    }
}