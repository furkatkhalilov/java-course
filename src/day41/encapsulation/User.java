package day41.encapsulation;

public class User {

    private long id;
    private String username;
    private String password;

    public User() {

    }

    public User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    // to make write-only, remove all get methods


    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // to make read-only, remove all set methods
    public long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

}
