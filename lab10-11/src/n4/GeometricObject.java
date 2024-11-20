package n4;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        return obj1.compareTo(obj2) > 0 ? obj1 : obj2;
    }
}

