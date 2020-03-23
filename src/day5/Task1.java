package day5;

import java.util.Scanner;

public class Task1 {
    // create java application that asks user
    // for username and password

    public static void main(String[] args) {
        Scanner readFromUser = new Scanner( System.in );

        // part 1 using Strings only
        System.out.println("Please enter your username:");
        String username = readFromUser.nextLine();

        System.out.println("Please enter your password:");
        String password = readFromUser.nextLine();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // part 2 using number for password
//        System.out.println( "Please enter your password:" );
//        int password = readFromUser.nextInt();
//
//        readFromUser.nextLine();
//        System.out.println( "Please enter your username:" );
//        String username = readFromUser.nextLine();
//
//        System.out.println( "Username: " + username );
//        System.out.println( "Password: " + password );
    }
}



//        Dos
//        123
//
//                Username: Dos
//                Password: 123