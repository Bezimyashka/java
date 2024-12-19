package tasks;

import java.util.Scanner;

public class t1t2_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        t1t2<String> stack = new t1t2<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}