import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateFromMillis {
    public static void main(String[] args) {
        long millis = 1234567898765L;
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(millis);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Январь - это 0
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Дата для millis " + millis + ": " + year + "-" + month + "-" + day);
    }
}
