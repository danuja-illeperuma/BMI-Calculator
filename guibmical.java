import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guibmical extends JFrame {
    private JPanel mainpanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton calculateButton;
    private JButton clearButton;
    private JComboBox comboBox1;
    private JList list1;
    private JLabel unitslabel;

    public guibmical() {


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedIndex() == 0) {
                    unitslabel.setText("<html>Enter the Height in Inches<br> Weight in Pounds </html>");

                }
                else{
                    unitslabel.setText("<html>Enter Height in Meters<br> Weight in Kilograms</html>");
                }
            }
        });



















        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                double height;
                double weight;
                double BMI;
                String bmivalue;

                if (comboBox1.getSelectedIndex() == 0) {


                    if (textField1.getText().equals("") || textField2.getText().equals("") || !(text1.matches("-?\\d+(\\.\\d+)?")) || !(text2.matches("-?\\d+(\\.\\d+)?"))) {
                        JOptionPane.showMessageDialog(calculateButton, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        height = Double.parseDouble(textField1.getText());
                        weight = Double.parseDouble(textField2.getText());

                        BMI = (weight * 703) / (height * height);

                        if (BMI >= 30) {
                            bmivalue = "Obese";


                        } else if (25 <= BMI && BMI <= 29.9) {
                            bmivalue = "Overweight";
                        } else if (18.5 <= BMI && BMI <= 24.9) {
                            bmivalue = "Normal";
                        } else {
                            bmivalue = "Underweight";
                        }
                        JOptionPane.showMessageDialog(calculateButton, "BMI is " + BMI + "\n Your Category is : " + bmivalue, "BMI", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else if (comboBox1.getSelectedIndex() == 1) {

                    if (textField1.getText().equals("") || textField2.getText().equals("") || !(text1.matches("-?\\d+(\\.\\d+)?")) || !(text2.matches("-?\\d+(\\.\\d+)?"))) {
                        JOptionPane.showMessageDialog(calculateButton, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        height = Double.parseDouble(textField1.getText());
                        weight = Double.parseDouble(textField2.getText());

                        BMI = weight / (height * height);

                        if (BMI >= 30) {
                            bmivalue = "Obese";


                        } else if (25 <= BMI && BMI <= 29.9) {
                            bmivalue = "Overweight";
                        } else if (18.5 <= BMI && BMI <= 24.9) {
                            bmivalue = "Normal";
                        } else {
                            bmivalue = "Underweight";
                        }
                        JOptionPane.showMessageDialog(calculateButton, "BMI is " + BMI + "\n Your Category is : " + bmivalue, "BMI", JOptionPane.INFORMATION_MESSAGE);
                    }


                }
            }
        });


    }
    public static void main(String[] args) {
        guibmical frame = new guibmical();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(frame.mainpanel);
        frame.setTitle("bmical");
        frame.setSize(450, 450);
        frame.setVisible(true);
    }
}
