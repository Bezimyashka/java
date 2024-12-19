package tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class t7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pasha");
        list.add("Hasaan");
        list.add("Nikita");
        list.add("Lenya");
        list.add("Masha");

        System.out.println("До перестановки: " + list);
        shuffle(list);
        System.out.println("После перестановки: " + list);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Random rand = new Random();
        for (int i = list.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Collections.swap(list, i, j);
        }
    }
}

