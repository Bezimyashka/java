package tasks;

public class t4 {
    public static void main(String[] args) {
        t1t2<String> stack = new t1t2<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("бу");

        System.out.println("Содержимое стека: " + stack);

        int index = linearSearch(stack, "2");
        System.out.println("Индекс элемента '1': " + index);

        int notFound = linearSearch(stack, "бу");
        System.out.println("Индекс элемента '3': " + notFound);
    }

    public static <E> int linearSearch(t1t2<E> stack, E element) {
        for (int i = 0; i < stack.getSize(); i++) {
            if (stack.get(i).equals(element)) { // Используем метод get
                return i;
            }
        }
        return -1; // Если элемент не найден
    }
}