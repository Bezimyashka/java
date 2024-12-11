package n1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorExample extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    private JLabel resultLabel;

    public CalculatorExample() {
        setTitle("Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("1st Number"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("2nd Number"));
        num2Field = new JTextField();
        add(num2Field);

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");

        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        addButton.addActionListener(new CalcListener());
        subtractButton.addActionListener(new CalcListener());
        multiplyButton.addActionListener(new CalcListener());
        divideButton.addActionListener(new CalcListener());

        setVisible(true);
    }

    private class CalcListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = 0;

                if (e.getSource() == addButton) {
                    result = num1 + num2;
                } else if (e.getSource() == subtractButton) {
                    result = num1 - num2;
                } else if (e.getSource() == multiplyButton) {
                    result = num1 * num2;
                } else if (e.getSource() == divideButton) {
                    result = num1 / num2;
                }

                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorExample();
    }
}

