package day52;

public class App {

    public static void main(String[] args) {


        SimpleStringSet set = new SimpleStringSet();
        set.add("1");
        set.add("2");
        set.add("3");
        set.isEmpty();
        set.remove("str");
        set.size();

//        System.out.println(set);

        set.print();

        set.clear();

    }
}
