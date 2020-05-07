package day32.tasks.task1;

import java.util.Arrays;

public class Task1 {
    static final String[] months = {
            "January", "February",
            "March", "April", "May",
            "June", "July", "August",
            "September", "October", "November",
            "December"};

    public static void main(String[] args) {
        System.out.println("Before change: " + Arrays.toString(months));

        months[0] = "Winter month";
        System.out.println("After change: " + Arrays.toString(months));

        //changing String[] months
//        months = new String[]{"Winter", "Summer"};
    }
}
