package day29.tasks.task2;

/*
***Part 1***
create class Login with attributes
1. username
2. password
 */
public class Login {
    String username;
    String password;
    String role;//admin, user

    public static Login createAdmin(String u, String p) {
        Login login = new Login();
        login.username = u;
        login.password = p;
        login.role = "Admin";

        return login;
    }
    public static Login createUser(String u, String p) {
        Login login = new Login();
        login.username = u;
        login.password = p;
        login.role = "User";

        return login;
    }

    /*
    ***Part 3***
    create instance method in Login to check
    if username and password are not empty and not null
     */
    public void check() {
        boolean invalidUsername = username == null && username.isEmpty();
        if(invalidUsername) {
            System.out.println("user name is null or empty");
        }

        boolean invalidPassword = password == null && password.isEmpty();
        if(invalidPassword) {
            System.out.println(" passord is null or empty");
        }
    }

}
