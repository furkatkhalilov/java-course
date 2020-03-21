package day4;

public class JavaWideningCasting {

    public static void main(String[] args) {
//        Widening Casting (automatically) - converting a smaller type to a larger type size
//        byte -> short -> char -> int -> long -> float -> double

        int number = 50;
        double decimal = number;

        System.out.println( number );
        System.out.println( decimal );
    }

}
