package day19;

public class Task2 {
    // create a method which checks if length of string is at least 8 characters

    public static boolean checkLength(String str) {
        boolean result = str.length() >= 8;

        return result;
    }


    // try to ovoid writing redundant code
    public static boolean checkLength2(String text) {
        if(text.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }


    // create a method which checks if character is letter
    public static boolean isLetter(char character) {
        character = Character.toLowerCase(character);

        boolean isLetter = character >= 'a' && character <= 'z';
        return isLetter;
    }


    // create a method which counts letters in given string

    // create a method which checks if character is digit
    // create a method which counts digits in given string




//    Write a Java method to check whether a string is a valid password.
//    Password rules:
//    A password must have at least ten characters.
//    A password consists of only letters and digits.
//    A password must contain at least two digits.
}
