package day7;

public class StringReplaceFirst {
    /*
     replaceFirst()

     Replaces the first occurrence of a substring
     that matches the given regular expression
     with the given replacement

     String
     */

    // ([A-Z]) regex -> will search for UPPERCASE letters

    public static void main(String[] args) {
        String text = "software DEVELOPER inc";

        System.out.println( text.replaceFirst( "[A-Z]", "d" ) );
    }

}
