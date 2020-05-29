package day45.staticBlock;

public class Application {
    public static String name;

    static {
        name = "My App";
        System.out.println("static block");
    }

    public Application() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }


}
