/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.trident.centurycinema.buttons;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class RoundedButton extends JButton {
    private boolean over;
    private Color backgroundColor;
    private Color hoverColor;
    private Color clickColor;
    private Color textColor;
    private float alpha = 1.0f;

    public RoundedButton() {
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setFont(getFont().deriveFont(12.0f));

        backgroundColor = new Color(207, 145, 18);
        hoverColor = backgroundColor;
        clickColor = backgroundColor.darker();
        textColor = Color.WHITE;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                over = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                over = false;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                alpha = 0.4f;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                alpha = 1.0f;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background
        g2.setColor(applyAlpha(backgroundColor));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);

        // Text
        g2.setColor(textColor);
        g2.drawString(getText(), (getWidth() - g2.getFontMetrics().stringWidth(getText())) / 2,
                (getHeight() + g2.getFontMetrics().getAscent() - g2.getFontMetrics().getDescent()) / 2);

        g2.dispose();
    }

    private Color applyAlpha(Color color) {
        int alphaValue = Math.round(alpha * 255);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), alphaValue);
    }

    @Override
    public void setBackground(Color color) {
        backgroundColor = color;
        super.setBackground(color);
    }

    @Override
    public void setForeground(Color color) {
        textColor = color;
        super.setForeground(color);
    }
}
