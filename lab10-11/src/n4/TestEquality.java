package n4;

public class TestEquality {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println("circle1 equals circle2: " + circle1.equals(circle2)); // true
        System.out.println("circle1 equals circle3: " + circle1.equals(circle3)); // false
    }
}
