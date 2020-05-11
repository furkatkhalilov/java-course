package day35.example.creatingAndFormatting;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDate {

    public static void main(String[] args) {
        // LocalDate - Contains just a date, no time and no time zone. (19/12/1989, birthday this year)
        LocalDate localDate = LocalDate.now();

        LocalDate localDate1 = LocalDate.of(2020, 05, 24);
        LocalDate localDate2 = LocalDate.of(2020, Month.MAY, 24);

        int dayOfMonth = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int dayOfYear = localDate.getDayOfYear();

        Month month = localDate.getMonth();
        int monthValue = localDate.getMonthValue();

        int year = localDate.getYear();


        System.out.println("Short Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("Medium Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("Long Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Full Date: " + localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("MM dd yyy: " + localDate.format(DateTimeFormatter.ofPattern("yyy.MM.dd")));

        //just fyi coders/programmes/ developers day => 256th of year


    }
}
