package day31.privateModifiers.same;

/*
private
The code is only accessible within the declared class
 */
public class Person {
    //private instance variable
    private String name;

    //private constructor
    private Person() {
        name = "Default Name";
    }

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int id;

    public String toString() {
        return "Name: " + name;
    }

    //private method
    private int getAge() {
        return 20;
    }
}
