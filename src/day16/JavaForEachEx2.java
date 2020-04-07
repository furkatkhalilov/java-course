package day16;

public class JavaForEachEx2 {

    public static void main(String[] args) {
        int[] array = new int[5];

        //you can't change value of your array using foreach loop
        for(int number : array) {
            number = 5;
            System.out.println( number );
        }

    }

}
