package swing_awt;

import javax.swing.*;
import java.awt.event.*;

public class SwingExample extends JFrame implements ActionListener {
  JButton btn;

  public SwingExample() {
    btn = new JButton("Click Me");
    btn.addActionListener(this);

    add(btn);

    setSize(300, 200);
    setTitle("Swing Example");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on X
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("Button clicked!");
  }

  public static void main(String[] args) {
    new SwingExample();
  }
}
