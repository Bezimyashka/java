package tasks;
import java.util.ArrayList;

public class t8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pasha");
        list.add("Hasaan");
        list.add("Nikita");
        list.add("Lenya");
        list.add("Masha");

        System.out.println("До сортировки: " + list);

        sort(list);

        System.out.println("После сортировки: " + list);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        list.sort(null);
    }
}