package tasks;

import java.util.ArrayList;

public class t1t2<E> extends ArrayList<E> {
    private int size;  // Текущий размер стека

    public t1t2() {
        super(); // Инициализация списка через родительский класс
        size = 0; // Установка начального размера
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return get(size - 1);
    }

    public void push(E o) {
        add(o);  // Используем метод add из ArrayList
        size++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        E element = remove(size - 1);  // Используем метод remove из ArrayList
        size--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        // Не требуется, так как ArrayList автоматически изменяет размер
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(get(i));  // Используем метод get из ArrayList
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}