package CommonExamples;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarClass {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat("d/M/yyyy hh:mm:ss");
        System.out.println("Current date: "+sd.format(cal.getTime()));
        System.out.println("Day of the month: "+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of the week: "+cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("AM/PM (AM=0 PM=1): "+cal.get(Calendar.AM_PM));
    }
}
