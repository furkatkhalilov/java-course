package day5;

import java.util.Scanner;

public class Task2 {
    // create java application that sums two integers from user
    // and show result


    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.println("Provide first number: ");
        int a = input.nextInt();

        System.out.println("Provide second number: ");
        int b = input.nextInt();

        int result = a + b;

        System.out.println("Sum is: " + result);

        System.out.println( "Sum is: " + a + b ); // this is wrong
        System.out.println( "Sum is: " + (a + b) ); // this is correct



    }

}
