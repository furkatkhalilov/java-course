package day4;

public class JavaNarrowingCasting {

    //    Narrowing Casting (manually) - converting a larger type to a smaller size type
//    double -> float -> long -> int -> char -> short -> byte
    public static void main(String[] args) {

        double decimal = 1.3;
        int number = (int) decimal;

        System.out.println( decimal );
        System.out.println( number );

    }

}
