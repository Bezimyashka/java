import javax.swing.*;
import java.awt.*;

public class ImagesApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Изображения");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1)); // Две строки

        ImageIcon image1 = new ImageIcon("image1.jpg");
        JLabel label1 = new JLabel(image1);
        label1.setText("Картинка 1");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        panel.add(label1);

        ImageIcon image2 = new ImageIcon("image2.jpg");
        JLabel label2 = new JLabel(image2);
        label2.setText("Картинка 2");
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.BOTTOM);
        panel.add(label2);

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}