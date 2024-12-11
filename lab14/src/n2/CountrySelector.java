package n2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountrySelector extends JFrame {
    private JComboBox<String> countryBox;
    private JLabel infoLabel;

    public CountrySelector() {
        setTitle("Country Selector");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        String[] countries = {"Australia", "China", "England", "Russia"};
        countryBox = new JComboBox<>(countries);
        countryBox.setBounds(50, 20, 200, 30);
        add(countryBox);

        infoLabel = new JLabel("Select a country");
        infoLabel.setBounds(50, 60, 200, 30);
        add(infoLabel);

        countryBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryBox.getSelectedItem();
                infoLabel.setText("You selected: " + selectedCountry);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CountrySelector();
    }
}

