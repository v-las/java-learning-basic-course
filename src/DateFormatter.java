import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) {
        Date  currentDate = new Date();
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");

        String currentDayOfTheWeek = dayOfTheWeekFormat.format(currentDate);
        System.out.println("Current day of the week: " + currentDayOfTheWeek);
    }
}
