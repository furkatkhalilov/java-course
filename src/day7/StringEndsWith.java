package day7;

public class StringEndsWith {
    /*
     endsWith()

     Checks whether a string ends with the specified character(s)

     boolean
     */

    public static void main(String[] args) {

        String text = "Hello world";

        System.out.println( "is text ends with Hello: " + text.endsWith( "Hello" ) ); //
        System.out.println( "is text ends with hello: " + text.endsWith( "hello" ) ); //
        System.out.println( "is text ends with world: " + text.endsWith( "world" ) ); //

    }
}
