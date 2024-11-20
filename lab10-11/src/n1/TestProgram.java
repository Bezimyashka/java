package n1;

public class TestProgram {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);

        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(3, 8);

        System.out.println("Max n1.Circle: " + GeometricObject.max(circle1, circle2).getArea());
        System.out.println("Max n1.Rectangle: " + GeometricObject.max(rect1, rect2).getArea());
    }
}