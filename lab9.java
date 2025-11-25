import javax.swing.*;
import java.awt.*;

public class lab9{
    public static void main (String[] args){
        JFrame frame = new JFrame("Display GUI components"); 
        frame.setLayout(new FlowLayout());
        JButton okButton = new JButton("ok");
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField("Tyype name here",12);
        JCheckBox BoldCheck = new JCheckBox("Bold");
        JRadioButton RedRadio = new JRadioButton("Red");
        JRadioButton BlueRadio = new JRadioButton("Blue");
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(RedRadio);
        colorGroup.add(BlueRadio);

        String[] colors = {"Red","Green","Blue"};
        JComboBox<String> colorBox = new JComboBox<>(colors);
        frame.add(okButton);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(BoldCheck);
        frame.add(RedRadio);
        frame.add(BlueRadio);
        frame.add(colorBox);
        frame.setSize(500,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}