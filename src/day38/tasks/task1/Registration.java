package day38.tasks.task1;

import java.util.Scanner;

/*
Create class Registration,
a. Create method signUp, where user will provide a password(Scanner)
b. Create method checkPassword, where we will check password for validity
 */
public class Registration {

    void signUp() {
        System.out.println("Please, provide a password: ");

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        checkPassword(password);

        System.out.println("Successful sign up");
    }

    //Password rules:
    private void checkPassword(String password) {
        //* must not be null
        if(password == null) {
            throw new NullPointerException("Your password must not be null");
        }
        //* must not be empty
        //* must not contain only spaces
        //* must contain at least 3 digits
        //* must contain at least 3 letters
        //* must have a length of 6

    }

}
