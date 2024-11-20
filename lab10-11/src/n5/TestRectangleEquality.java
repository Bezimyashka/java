package n5;

public class TestRectangleEquality {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(20, 1);
        Rectangle rect3 = new Rectangle(3, 8);

        System.out.println("rect1 equals rect2: " + rect1.equals(rect2)); // true
        System.out.println("rect1 equals rect3: " + rect1.equals(rect3)); // false
    }
}
