package swing_awt;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class SwingControlsDemo extends JFrame {

  // Declare Swing components
  private JButton button;
  private JLabel label;
  private JCheckBox checkBox;
  private JRadioButton radioButton1, radioButton2;
  private ButtonGroup radioGroup;
  private JList<String> list;
  private JComboBox<String> comboBox;
  private JTextField textField;
  private JTextArea textArea;
  private JScrollBar scrollBar;
  private JTable table;

  public SwingControlsDemo() {
    setTitle("Swing Controls Demo");
    setSize(700, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null); // Absolute positioning for demo clarity

    // JButton
    button = new JButton("Click Me");
    button.setBounds(20, 20, 120, 30);
    button.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button clicked!"));
    add(button);

    // JLabel
    label = new JLabel("This is a JLabel");
    label.setBounds(20, 60, 200, 30);
    add(label);

    // JCheckBox
    checkBox = new JCheckBox("Accept Terms");
    checkBox.setBounds(20, 100, 150, 30);
    checkBox.addItemListener(e -> {
      if (e.getStateChange() == ItemEvent.SELECTED) {
        label.setText("Checkbox is checked");
      } else {
        label.setText("Checkbox is unchecked");
      }
    });
    add(checkBox);

    // JRadioButton
    radioButton1 = new JRadioButton("Male");
    radioButton1.setBounds(20, 140, 100, 30);
    radioButton2 = new JRadioButton("Female");
    radioButton2.setBounds(120, 140, 100, 30);

    radioGroup = new ButtonGroup();
    radioGroup.add(radioButton1);
    radioGroup.add(radioButton2);

    ActionListener radioListener = e -> label.setText("Selected: " + e.getActionCommand());
    radioButton1.setActionCommand("Male");
    radioButton2.setActionCommand("Female");
    radioButton1.addActionListener(radioListener);
    radioButton2.addActionListener(radioListener);

    add(radioButton1);
    add(radioButton2);

    // JList
    String[] colors = { "Red", "Green", "Blue", "Yellow", "Black" };
    list = new JList<>(colors);
    list.setBounds(20, 180, 100, 80);
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    list.addListSelectionListener(e -> {
      if (!e.getValueIsAdjusting()) {
        label.setText("Selected Color: " + list.getSelectedValue());
      }
    });
    add(list);

    // JComboBox
    String[] fruits = { "Apple", "Banana", "Mango", "Orange" };
    comboBox = new JComboBox<>(fruits);
    comboBox.setBounds(150, 180, 120, 30);
    comboBox.addActionListener(e -> label.setText("Selected Fruit: " + comboBox.getSelectedItem()));
    add(comboBox);

    // JTextField
    textField = new JTextField();
    textField.setBounds(20, 270, 250, 30);
    textField.addActionListener(e -> label.setText("TextField Entered: " + textField.getText()));
    add(textField);

    // JTextArea with ScrollPane
    textArea = new JTextArea();
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);

    JScrollPane scrollPane = new JScrollPane(textArea);
    scrollPane.setBounds(20, 310, 250, 100);
    add(scrollPane);

    // JScrollBar
    scrollBar = new JScrollBar(JScrollBar.VERTICAL, 0, 30, 0, 100);
    scrollBar.setBounds(280, 310, 20, 100);
    scrollBar.addAdjustmentListener(e -> label.setText("Scrollbar Value: " + e.getValue()));
    add(scrollBar);

    // JTable
    String[] columns = { "ID", "Name", "Age" };
    Object[][] data = {
        { 1, "Alice", 23 },
        { 2, "Bob", 30 },
        { 3, "Carol", 28 }
    };
    DefaultTableModel model = new DefaultTableModel(data, columns);
    table = new JTable(model);
    JScrollPane tableScrollPane = new JScrollPane(table);
    tableScrollPane.setBounds(400, 20, 250, 150);
    add(tableScrollPane);

    setVisible(true);
  }

  public static void main(String[] args) {
    new SwingControlsDemo();
  }
}
