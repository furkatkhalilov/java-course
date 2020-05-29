package day45.staticBlock;

public class Content {
    public static String url;

    static {
        url = "techno.study";
    }

    public Content() {
        System.out.println("Content constructor");
    }
}
