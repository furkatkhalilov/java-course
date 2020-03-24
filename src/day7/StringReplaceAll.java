package day7;

public class StringReplaceAll {

    /*
     replaceAll()

     Replaces each substring of this string
     that matches the given regular expression
     with the given replacement

     String
     */

    public static void main(String[] args) {
        String text = "software DEVELOPER inc";

        System.out.println( text.replaceAll( "[A-Z]", "d" ) );
    }
}
