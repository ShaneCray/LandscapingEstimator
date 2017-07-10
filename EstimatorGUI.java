import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EstimatorGUI extends JFrame {
  
  
  JTextArea area;
  JTextField length;
  JTextField width;
  JTextField mulch;
  JTextField labor;
  JTextField numberOfPlants;
  JTextField highestBid;
  JTextField totalCost;
  
  public EstimatorGUI() {
    initUI();
  }
  
  public void initUI() {
    setLayout(null);
    
    JOptionPane.showMessageDialog(this, "Enter only valid numbers for each field.");
    
    // Creates label and field for length of area to be landscaped
    JLabel lengthLabel = new JLabel("Length: ");
    lengthLabel.setBounds(10, 340, 60, 25);
    length = new JTextField();
    length.setBounds(70, 340, 150, 25);
    
    // Creates label and field for width of area to be landscaped
    JLabel widthLabel = new JLabel("Width: ");
    widthLabel.setBounds(10, 380, 60, 25);
    width = new JTextField();
    width.setBounds(70, 380, 150, 25);
    
    // Creates label and field for pounds of mulch to be used
    JLabel mulchLabel = new JLabel("Mulch: ");
    mulchLabel.setBounds(10, 420, 60, 25);
    mulch = new JTextField();
    mulch.setBounds(70, 420, 150, 25);
    
    // Creates label and field for the number of plants to be used
    JLabel plantLabel = new JLabel("Plants: ");
    plantLabel.setBounds(10, 460, 60, 25);
    numberOfPlants = new JTextField();
    numberOfPlants.setBounds(70, 460, 150, 25);
    
    // Creates label and field for the number of plants to be used
    JLabel laborLabel = new JLabel("Labor: ");
    laborLabel.setBounds(10, 500, 60, 25);
    labor = new JTextField();
    labor.setBounds(70, 500, 150, 25);
    
    // create the text area that displays the calculations
    area = new JTextArea();
    area.setBounds(0, 0, 700, 300);
    area.setEditable(false);
    
    JScrollPane scrollPane = new JScrollPane(area);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setBounds(0, 0, 500, 300);
    
    add(lengthLabel);
    add(length);
    add(widthLabel);
    add(width);
    add(mulchLabel);
    add(mulch);
    add(plantLabel);
    add(numberOfPlants);
    add(laborLabel);
    add(labor);
    add(area);
    add(scrollPane);
    
    
    // Sets size and title of executable GUI
    setTitle("Landscaping Estimator");
    setSize(700, 700);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        EstimatorGUI ex = new EstimatorGUI();
        ex.setVisible(true);
      }});
  }
}
