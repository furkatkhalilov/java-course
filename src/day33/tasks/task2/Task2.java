package day33.tasks.task2;

import java.util.Arrays;

public class Task2 {

    //given numbers in string
    //find maximum
    public static void main(String[] args) {
        int[] numbers = new int[args.length];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(numbers);

        int max = numbers[numbers.length - 1];
        System.out.println("Maximum is: " + max);
    }

}
