package day8;

import java.util.Scanner;

public class Task5 {
    // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter temperature in Fahrenheit:" );
        int fahrenheit = scanner.nextInt();

        // formula
        // (32°F − 32) × 5/9 = 0°C
        // c = (f-32)*5/9
        int celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println( "Converted to Celsius: " + celsius );

    }

}
