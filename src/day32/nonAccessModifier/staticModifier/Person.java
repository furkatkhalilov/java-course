package day32.nonAccessModifier.staticModifier;

public class Person {
    String name;
    static String planetName;

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Planet: " + planetName);
        System.out.println();
    }


    public static void main(String[] args) {
        Person.planetName = "Earth";

        Person person1 = new Person();
        person1.name = "John";
        person1.print();

        Person person2 = new Person();
        person2.name = "Alice";
        person2.print();

        Person.planetName = "Mars";
        System.out.println("After expedition");
        person1.print();
        person2.print();


    }
}
