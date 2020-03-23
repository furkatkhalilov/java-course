package day6;

public class Task1 {
    //create variable with data type string
    //write your name and print its length

    public static void main(String[] args) {
        String myName = "Dos";

        String text1 = "Length of ";
        String text2 = " is: ";

        int l  = myName.length();

        String res = text1 + myName + text2 + l;
        System.out.println( res );
    }

}
