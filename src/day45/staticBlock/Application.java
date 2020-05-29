package day45.staticBlock;

public class Application extends Content {
    public static String name;

    // static block (also called static clause)
    static {
        name = "My App";
        System.out.println("Application Static block");
    }

    public Application() {
        super();
        System.out.println("Application Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Application Main method");

        new Application();
    }

}
