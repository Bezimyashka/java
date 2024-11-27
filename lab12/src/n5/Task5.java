package n5;

public class Task5 {
    public void fetchDetails(String key) {
        if (key == null) {
            throw new NullPointerException("Ошибка: ключ не может быть null в методе fetchDetails");
        }
        System.out.println("Полученные данные для ключа: " + key);
    }

    public static void main(String[] args) {
        Task5 example = new Task5();
        try {
            example.fetchDetails(null);
        } catch (NullPointerException ex) {
            System.out.println("Исключение обработано: " + ex.getMessage());
        }
    }
}
