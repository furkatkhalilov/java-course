package day52;

public class App {

    public static void main(String[] args) {
        SimpleStringSet simpleSet = new SimpleStringSet();
        simpleSet.add("Z");
        simpleSet.add("Y");
        simpleSet.add("X");
        System.out.println(simpleSet);

        SortedStringSet sortedSet = new SortedStringSet();
        sortedSet.add("Z");
        sortedSet.add("Y");
        sortedSet.add("X");
        System.out.println(sortedSet);

    }
}
