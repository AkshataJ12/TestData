package com.mycompany.myapp.jarmodule;
 
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.Test;
 
import static org.junit.Assert.*;
 
public class CoreTest {
 
    private static final String BIRTH_DATE = "1980-01-24";
    private static final String NOW = "2015-01-24";
    private static final int EXPECTED_AGE = 35;
 
    @Test
    public void currentTime_now_isReturnedOnCorrectFormat() throws Exception {
 
        String time = Core.currentTime();
        assertNotNull("The returned time was null", time);
 
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendHourOfDay(2)
                .appendLiteral(":")
                .appendMinuteOfHour(2)
                .appendLiteral(":")
                .appendSecondOfMinute(2)
                .toFormatter();
 
        try {
            DateTime.parse(time, formatter);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
 
    @Test
    public void calculateAge_givenDates_correctAgeReturned() throws Exception {
 
        int age = Core.calculateAge(BIRTH_DATE, NOW);
        assertEquals("The calculated age is wrong", EXPECTED_AGE, age);
    }
}