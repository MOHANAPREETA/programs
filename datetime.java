package first;

import java.util.Date;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class datetime {
    public static void main(String[] args) {
        Date t1 = new Date();
        System.out.println("Date from java.util.Date: " + t1);

        LocalTime now = LocalTime.now();
        System.out.println("Current time using LocalTime: " + now);

        LocalDate d1 = LocalDate.of(2015, 2, 20);
        LocalDate d2 = LocalDate.parse("2015-02-20");
        LocalDate tomorrow = d2.plusDays(1);
        LocalDate previousMonthSameDay = LocalDate.now().minus(2, ChronoUnit.MONTHS);
        DayOfWeek sunday = LocalDate.parse("2016-06-16").getDayOfWeek();
        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
        boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
        boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        LocalDateTime dt = LocalDate.parse("2016-06-12").atStartOfDay().minus(3, ChronoUnit.HOURS);
        LocalTime d3=now.MAX;
        LocalDate d4 = LocalDate.parse("2016-06-12");
        LocalDate d5 = LocalDate.parse("2016-06-12");
        long days = ChronoUnit.DAYS.between(d4, d5);

       
        System.out.println("d1: " + d1);
        
        System.out.println("d2: " + d2);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("2 months ago same day: " + previousMonthSameDay);
        System.out.println("Day of week for 2016-06-16: " + sunday);
        System.out.println("Day of month: " + twelve);
        System.out.println("Is 2016-06-12 before 2016-06-11? " + notBefore);
        System.out.println("Is 2016-06-12 after 2016-06-11? " + isAfter);
        System.out.println("Beginning of day: " + beginningOfDay);
        System.out.println("3 hours before 2016-06-12 start of day: " + dt);
        System.out.println(d3);
        System.out.println(days);
    }
}
