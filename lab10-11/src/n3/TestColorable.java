package n3;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Circle(3),
                new Rectangle(4, 5),
                new Square(4),
                new Circle(5),
                new Square(6)
        };

        for (GeometricObject obj : objects) {
            System.out.println("Area: " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}
