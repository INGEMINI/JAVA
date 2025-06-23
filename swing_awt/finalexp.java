package swing_awt;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class finalexp {
  public static void main(String[] args) {
    // Create frame
    JFrame frame = new JFrame("Swing Components Example");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a container (Panel) and set layout
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // vertical stacking

    // JLabel
    JLabel label = new JLabel("Enter your name:");

    // JTextField
    JTextField textField = new JTextField(20);

    // JCheckBox
    JCheckBox checkBox = new JCheckBox("I agree to terms");

    // JRadioButton
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");

    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add(male);
    genderGroup.add(female);

    // JComboBox
    String[] countries = { "India", "USA", "UK", "Germany" };
    JComboBox<String> countryBox = new JComboBox<>(countries);

    // JTextArea with scroll
    JTextArea textArea = new JTextArea(5, 20);
    JScrollPane textScroll = new JScrollPane(textArea);

    // JTable with scroll
    String[] columns = { "ID", "Name", "Country" };
    Object[][] data = {
        { 1, "Alice", "India" },
        { 2, "Bob", "USA" },
        { 3, "Charlie", "UK" }
    };
    JTable table = new JTable(new DefaultTableModel(data, columns));
    JScrollPane tableScroll = new JScrollPane(table);
    tableScroll.setPreferredSize(new Dimension(400, 100));

    // JButton
    JButton submitBtn = new JButton("Submit");

    // Add everything to panel
    panel.add(label);
    panel.add(textField);
    panel.add(new JLabel("Gender:"));
    panel.add(male);
    panel.add(female);
    panel.add(checkBox);
    panel.add(new JLabel("Country:"));
    panel.add(countryBox);
    panel.add(new JLabel("Comments:"));
    panel.add(textScroll);
    panel.add(new JLabel("User Table:"));
    panel.add(tableScroll);
    panel.add(submitBtn);

    // Add panel to frame
    frame.add(panel);
    frame.setVisible(true);
  }
}
