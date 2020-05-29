package day45.staticBlock;

public class Application extends Content {
    public static String name;

    // static block (also called static clause)
    static {
        name = "My App";
        System.out.println("Static block");
    }

    public Application() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        new Application();
    }

}
