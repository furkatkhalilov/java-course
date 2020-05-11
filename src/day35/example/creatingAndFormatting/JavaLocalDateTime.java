package day35.example.creatingAndFormatting;

import java.time.*;

public class JavaLocalDateTime {
    //LocalDateTime - Contains both a date and time but no time zone.(00:00 01/01/2021 new year, 20:10 05/11/2020 iftar)

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate1 = LocalDate.of(2020, 05, 24);
        LocalTime localTime1 = LocalTime.of(0, 0);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 01, 01, 0, 0);//new year date for 2021

        int year = localDateTime.getYear();

        Month month = localDateTime.getMonth();
        int monthValue = localDateTime.getMonthValue();

        int dayOfYear = localDateTime.getDayOfYear();
        int dayOfMonth = localDateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();

        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
    }

}
