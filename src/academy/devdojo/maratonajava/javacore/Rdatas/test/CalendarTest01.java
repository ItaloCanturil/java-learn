package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(2015, 5, 8);
        int dayNum = c.get(Calendar.DAY_OF_WEEK);
        String[] days = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println(days[dayNum]);
    }
}
