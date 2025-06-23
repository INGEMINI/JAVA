package swing_awt;

import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame implements ActionListener {
  Button btn;

  public AWTExample() {
    setLayout(new FlowLayout()); // Simple layout

    btn = new Button("Click Me");
    btn.addActionListener(this); // Listen to button click

    add(btn); // Add button to frame

    setSize(300, 200);
    setTitle("AWT Example");
    setVisible(true);

    // Window close event
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void actionPerformed(ActionEvent ae) {
    System.out.println("Button clicked!");
  }

  public static void main(String[] args) {
    new AWTExample();
  }
}
