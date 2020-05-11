package day35.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex1 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        boolean after = today.isAfter(yesterday);
        boolean before = today.isBefore(yesterday);
        boolean equal = today.isEqual(yesterday);
        boolean leapYear = today.isLeapYear();


        LocalTime time = LocalTime.now();
//        time.isBefore()
//        time.isAfter()

        LocalDateTime localDateTime = LocalDateTime.now();
//        localDateTime.isAfter()
//        localDateTime.isBefore()
//        localDateTime.isEqual()

    }
}
