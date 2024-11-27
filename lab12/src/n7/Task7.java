package n7;

import java.util.Scanner;

public class Task7 {
    public void promptForKey() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Введите ключ: ");
                    String inputKey = scanner.nextLine();
                    displayDetails(inputKey);
                    break;
                } catch (Exception ex) {
                    System.out.println("Ошибка: " + ex.getMessage());
                    System.out.println("Повторите ввод.");
                }
            }
        }
    }

    public void displayDetails(String key) throws Exception {
        if (key.trim().isEmpty()) {
            throw new Exception("Ключ не может быть пустым");
        }
        System.out.println("Получены данные для ключа: " + key);
    }

    public static void main(String[] args) {
        Task7 instance = new Task7();
        instance.promptForKey();
    }
}
