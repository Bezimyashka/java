import javax.swing.*;
import java.awt.*;

public class HelloWorldApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Привет МИР!");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Привет МИР!");
        panel.add(label);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
