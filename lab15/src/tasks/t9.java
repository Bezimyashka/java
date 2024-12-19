package tasks;
import java.util.ArrayList;
public class t9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(242);
        list.add(228);
        list.add(9);
        list.add(1337);

        System.out.println("Список: " + list);

        Integer maxElement = max(list);

        System.out.println("Наибольший элемент в списке: " + maxElement);
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }
        E maxElement = list.get(0);
        for (E element : list) {
            if (element.compareTo(maxElement) > 0) {
                maxElement = element;
            }
        }

        return maxElement;
    }
}


