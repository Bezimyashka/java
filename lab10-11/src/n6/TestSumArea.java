package n6;

public class TestSumArea {
    public static double sumArea(GeometricObject[] objects) {
        double totalArea = 0;
        for (GeometricObject obj : objects) {
            totalArea += obj.getArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Circle(3),
                new Rectangle(4, 5),
                new Circle(5),
                new Rectangle(6, 7)
        };

        double totalArea = sumArea(objects);
        System.out.println("Total Area: " + totalArea);
    }
}

