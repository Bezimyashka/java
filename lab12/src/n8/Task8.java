package n8;

import java.util.Scanner;

public class Task8 {
    public void promptForKey() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Введите ключ: ");
                    String inputKey = scanner.nextLine();
                    validateKey(inputKey);
                    System.out.println("Данные для ключа: " + inputKey);
                    break;
                } catch (Exception ex) {
                    System.out.println("Ошибка: " + ex.getMessage());
                    System.out.println("Пожалуйста, попробуйте снова.");
                }
            }
        }
    }

    private void validateKey(String key) throws Exception {
        if (key.trim().isEmpty()) {
            throw new Exception("Ключ не может быть пустым");
        }
    }

    public static void main(String[] args) {
        Task8 instance = new Task8();
        instance.promptForKey();
    }
}