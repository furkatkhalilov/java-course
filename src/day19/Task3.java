package day19;

public class Task3 {
    // create method that calculate sum of array
    public static int sum(int[] array) {
        int result = 0;
        for(int number : array) {
            result += number;
        }
        return result;
    }

    //create method that calculate average of numbers in int array
    public static double average(int[] array) {
        int sum = sum(array);
        int count = array.length;

        double average = (double) sum / count;
        return average;
    }

    //2. way
    public static double average2(int[] array) {
        return (double) sum(array) / array.length;
    }
}
