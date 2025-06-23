package swing_awt;

import javax.swing.*;
import java.awt.*;

public class SwingGraphicsDemo extends JFrame {

  public SwingGraphicsDemo() {
    setTitle("Swing Graphics Demo");
    setSize(600, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(new MyPanel()); // Add custom panel that does painting
    setVisible(true);
  }

  // Custom JPanel to override paintComponent and draw graphics
  class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      // Set background color
      setBackground(Color.WHITE);

      // Draw some shapes
      g.setColor(Color.RED);
      g.fillRect(50, 50, 100, 50); // Filled rectangle

      g.setColor(Color.BLUE);
      g.drawOval(200, 50, 100, 100); // Oval outline

      g.setColor(Color.GREEN);
      g.fillOval(350, 50, 100, 100); // Filled oval

      // Draw lines
      g.setColor(Color.BLACK);
      g.drawLine(50, 150, 150, 200);

      // Draw string text
      g.setFont(new Font("Serif", Font.BOLD, 20));
      g.drawString("Hello, Swing Graphics!", 50, 250);

      // Draw polygon (triangle)
      int[] xPoints = { 300, 350, 400 };
      int[] yPoints = { 200, 150, 200 };
      g.setColor(Color.MAGENTA);
      g.fillPolygon(xPoints, yPoints, 3);
    }
  }

  public static void main(String[] args) {
    new SwingGraphicsDemo();
  }
}
