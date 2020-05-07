package day32.nonAccessModifier.example;

import java.util.ArrayList;

public class Ex2 {

    static final ArrayList<String> list = new ArrayList<>();

    static final String name = "Maximilian";

    public static void main(String[] args) {
        System.out.println("Replace: " + name.replace("i", "o"));
        //name = name.replace("i", "o");
        name.substring(0,1);
        System.out.println("Name: " + name);


//
//        list.add("John");
//        list.add("Alice");
//        System.out.println(list);

        // cannot reassign after initialization, because if final
        // list = new ArrayList<>();

    }
}
