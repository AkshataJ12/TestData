package com.mycompany.myapp.jarmodule;
 
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
 
public final class Core {
 
    private Core() {
    }
 
    public static String currentTime() {
 
        return new DateTime().toString("HH:mm:ss");
    }
 
    public static int calculateAge(String birthDay, String now) {
 
        if (birthDay == null || birthDay.length() == 0) {
            throw new IllegalArgumentException("Parameter birthDay must have a value");
        }
 
        if (now == null || now.length() == 0) {
            throw new IllegalArgumentException("Parameter now must have a value");
        }
 
        DateTime dateTimeBirthDay = DateTime.parse(birthDay);
        DateTime dateTimeNow = DateTime.parse(now);
 
        Period period = new Period(dateTimeBirthDay, dateTimeNow, PeriodType.yearMonthDay());
 
        return period.getYears();
    }
}	