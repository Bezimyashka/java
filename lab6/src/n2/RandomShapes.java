package n2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapes extends JPanel {
    private List<Shape> shapes;

    public RandomShapes() {
        shapes = new ArrayList<>();
        Random random = new Random();

        // Генерация 20 случайных фигур
        for (int i = 0; i < 20; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(400);
            int y = random.nextInt(400);

            // Случайно выбираем, какую фигуру создать
            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10; // Радиус от 10 до 59
                shapes.add(new Circle(color, x, y, radius));
            } else {
                int width = random.nextInt(60) + 10; // Ширина от 10 до 69
                int height = random.nextInt(60) + 10; // Высота от 10 до 69
                shapes.add(new Rectangle(color, x, y, width, height));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        RandomShapes panel = new RandomShapes();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}