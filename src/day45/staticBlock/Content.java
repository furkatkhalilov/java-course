package day45.staticBlock;

public class Content {
    public static String url;

    static {
        url = "techno.study";
        System.out.println("Content static block");
    }

    public Content() {
        System.out.println("Content constructor");
    }
}
