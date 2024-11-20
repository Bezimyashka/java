package n2;

public class ComparableCircle extends Circle {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (o instanceof Circle) {
            return Double.compare(this.getArea(), o.getArea());
        } else {
            throw new IllegalArgumentException("Cannot compare Circle with non-Circle object");
        }
    }
}
