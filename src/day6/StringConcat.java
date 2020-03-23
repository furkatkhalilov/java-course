package day6;

public class StringConcat {

    // Appends a string to the end of another string
    public static void main(String[] args) {
        String name = "John";

        // name.concat( " " ).concat( "other string" ); putting space

        System.out.println(
                name.concat( " is awesome!!!" )
                // "John" + " is awesome!!!"
                // "John is awesome!!!"
        );

        System.out.println(
                name + " is awesome!!!"
        );

    }

}
