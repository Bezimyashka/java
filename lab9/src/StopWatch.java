public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        // Конструктор, который инициализирует startTime
        startTime = System.currentTimeMillis();
    }

    public void start() {
        // Метод для начала отсчета времени
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        // Метод для остановки отсчета времени
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        // Метод для получения прошедшего времени
        return endTime - startTime;
    }
}