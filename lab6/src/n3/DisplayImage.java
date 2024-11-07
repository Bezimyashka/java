import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DisplayImage extends JPanel {
    private Image image;

    public DisplayImage(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Укажите путь к изображению в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];
        JFrame frame = new JFrame("Отображение изображения");
        DisplayImage panel = new DisplayImage(imagePath);
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}