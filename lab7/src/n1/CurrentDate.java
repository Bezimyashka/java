import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentDate {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Январь - это 0
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Текущая дата: " + year + "-" + month + "-" + day);
    }
}
