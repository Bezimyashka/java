package n2;

import java.util.Scanner;

public class Task2 {
    public void demonstrateExceptionHandling() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            String userInput = scanner.next();
            int number = Integer.parseInt(userInput);
            System.out.println("Результат вычисления: " + (2 / number));
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка: введённое значение не является целым числом.");
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка: на ноль делить нельзя.");
        } finally {
            System.out.println("Завершение работы программы.");
        }
    }

    public static void main(String[] args) {
        Task2 handlerExample = new Task2();
        handlerExample.demonstrateExceptionHandling();
    }
}
