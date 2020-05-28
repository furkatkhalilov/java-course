package day44.staticFieldInheritance;

public class App {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("1. from A: " + A.text);

        B b = new B();
        System.out.println("from B: " + B.text);

        System.out.println("2. from A: " + A.text);
    }
}
