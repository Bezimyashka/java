import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AnimationExample extends JPanel implements ActionListener {
    private Image[] frames;
    private int currentFrame = 0;
    private Timer timer;

    public AnimationExample(String[] framePaths) {
        frames = new Image[framePaths.length];
        try {
            for (int i = 0; i < framePaths.length; i++) {
                frames[i] = ImageIO.read(new File(framePaths[i]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        timer = new Timer(100, this); // 100 мс между кадрами
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (frames.length > 0) {
            g.drawImage(frames[currentFrame], 0, 0, this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentFrame = (currentFrame + 1) % frames.length; // Цикл по кадрам
        repaint();
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Укажите пути к кадрам анимации в аргументах командной строки.");
            return;
        }

        JFrame frame = new JFrame("Анимация");
        AnimationExample panel = new AnimationExample(args);
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}