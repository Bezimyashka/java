import javax.swing.*;
import java.awt.*;

public class TwoPanelsApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Две панели");
        frame.setLayout(new GridLayout(2, 1)); // Две панели вертикально

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Первая панель");
        label1.setFont(new Font("Arial", Font.BOLD, 24)); // Изменение размера шрифта
        label1.setForeground(Color.RED); // Изменение цвета шрифта
        panel1.add(label1);
        frame.add(panel1);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Вторая панель");
        label2.setFont(new Font("Arial", Font.BOLD, 24));
        label2.setForeground(Color.BLUE);
        panel2.add(label2);
        frame.add(panel2);

        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
