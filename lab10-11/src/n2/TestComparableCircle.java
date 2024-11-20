package n2;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(7);

        GeometricObject maxCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Max Circle Area: " + maxCircle.getArea());
    }
}