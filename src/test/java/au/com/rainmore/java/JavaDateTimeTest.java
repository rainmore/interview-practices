package au.com.rainmore.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaDateTimeTest {

    private JavaDateTime test = new JavaDateTime();

    @Test
    void test1() {
        int year = 2015;
        int month = 8;
        int day = 5;

        String result = test.findDay(month, day, year);

        assertEquals("WEDNESDAY", result);

    }

}
