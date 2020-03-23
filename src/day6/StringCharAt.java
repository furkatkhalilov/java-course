package day6;

public class StringCharAt {
    /*
     charAt()
     Returns the character at the specified index (position)

    char
     */

    public static void main(String[] args) {
        String text = "Google";
        System.out.println(text.charAt( 5 ));

        System.out.println(text.charAt( -1 )); //gives exception
    }
}
