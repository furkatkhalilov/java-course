package day41.encapsulation;

public class User {

    private long id;
    private String username;
    private String password;

    public User() {

    }

//    public User(long id, String username, String password) {
//        setId(id);
//        setUsername(username);
//        setPassword(password);
//    }


    public User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        //this.password = password;
        setPassword(password);
    }

    // to make write-only, remove all get methods
    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        //password is valid only when length > 6
        if(password.length() < 6) {
            throw new IllegalArgumentException("Password length is too short, provide longer password!");
        }

        //
        this.password = password;
    }

    // to make read-only, remove all set methods


    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    // assume if id = 1, it is ADMIN, and we do not show password of admin
    public String getPassword() {
        if(this.id == 1){
            throw new RuntimeException("you cannot see password of admin");
        }
        return password;
    }
}
