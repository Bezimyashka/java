package n1;

public class Task1 {
    public void demonstrateException() {
        try {
            System.out.println("Результат: " + (2 / 0));
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка: деление на ноль невозможно");
        }
    }

    public static void main(String[] args) {
        Task1 demoInstance = new Task1();
        demoInstance.demonstrateException();
    }
}
