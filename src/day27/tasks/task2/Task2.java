package day27.tasks.task2;

public class Task2 {

    public static void main(String[] args) {
        // create users and print all attributes of user
        User user1 = createUser("techno", "19138", "Techno", "Study");
        printAttributes(user1);

        User user2 = createUser("dos", "gga38", "Dos", "Santos");
        printAttributes(user2);

        User user3 = createUser("erentitan", "909090", "Eren", "Yager");
        printAttributes(user3);
    }

    public static User createUser(String username, String password, String firstName, String lastName) {
        User user = new User();
        user.username = username;
        user.password = password;
        user.firstName = firstName;
        user.lastName = lastName;

        return user;
    }

    public static void printAttributes(User user) {
        System.out.println("\nUsername: " + user.username);
        System.out.println("Password: " + user.password);
        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
    }


}
