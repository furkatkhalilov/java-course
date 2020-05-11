package day35.example.creatingAndFormatting;

import java.time.LocalTime;

public class JavaLocalTime {

    public static void main(String[] args) {
        // LocalTime - Contains just a time, no date and no time zone. (midnight, ts. morning class start time -> 9:00am)
        LocalTime localTime = LocalTime.now();

        LocalTime localTime1 = LocalTime.of(0, 0);
        LocalTime localTime2 = LocalTime.of(10, 0, 30);

        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();

    }

}
