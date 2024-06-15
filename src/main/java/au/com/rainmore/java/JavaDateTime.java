package au.com.rainmore.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * https://www.hackerrank.com/challenges/java-date-and-time/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=30-day-campaign
 * Java Date and Time
 */
public class JavaDateTime {


    public String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeZone(TimeZone.getTimeZone(ZoneId.of("America/New_York")));
        calendar.set(year, month - 1, day);

        DateFormat format = new SimpleDateFormat("EEEE");
        String result = format.format(calendar.getTime());
        return result.toUpperCase();
    }
}
