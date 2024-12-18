import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triplet<A> {
    private final A first;
    private final A second;
    private final A third;

    public Triplet(A first, A second, A third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public A getSecond() {
        return second;
    }

    public A getThird() {
        return third;
    }

    public boolean contains(A element) {
        return first.equals(element) || second.equals(element) || third.equals(element);
    }

    public A getMin() {
        List<A> elements = Arrays.asList(first, second, third);
        return Collections.min(elements, null);
    }

    public String sum() {
        if (first instanceof Number && second instanceof Number && third instanceof Number) {
            double sum = ((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue();
            return String.valueOf(sum);
        } else {
            return first.toString() + " " + second.toString() + " " + third.toString();
        }
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    public static void main(String[] args) {
        Triplet<Integer> intTriplet = new Triplet<>(6, 3, 1);
        System.out.println("Кортеж: " + intTriplet);
        System.out.println("Содержит 1? " + intTriplet.contains(1));
        System.out.println("Наименьший элемент: " + intTriplet.getMin());
        System.out.println("Сумма элементов: " + intTriplet.sum());

        Triplet<String> stringTriplet = new Triplet<>("стул", "сумка", "ключи");
        System.out.println("Кортеж: " + stringTriplet);
        System.out.println("Содержит банан? " + stringTriplet.contains("ключи"));
        System.out.println("Наименьший элемент: " + stringTriplet.getMin());
        System.out.println("Сумма элементов: " + stringTriplet.sum());
    }
}
