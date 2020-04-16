package day21;

import java.util.ArrayList;

public class JavaArrayList {

    // ArrayList
    // Set
    // Map

    //
    public static void main(String[] args) {
        // declaring arrayLists
        ArrayList<Integer> integerArrayList;
        ArrayList<String> stringArrayList;
        ArrayList<Boolean> booleanArrayList;


        // initialize String ArrayList
        ArrayList<String> names = new ArrayList<>();

        // adding elements to arrayList
        names.add("Jon");
        names.add("Aria");
        names.add("Maruf");

        // adding element at specific position
        names.add(1, "Ali");

        // to get element from arrayList
        String elementAtIndex2 = names.get(2);

        // to update/change/set element at specific position
        names.set(0, "Bulut");

        // to get size/length of arrayList
        int sizeOfArrayList = names.size();

        // check if arrayList is empty
        boolean empty = names.isEmpty();

        // to remove element
        names.remove("Aria");

        // to remove element at specific position
        names.remove(0);

        // to get index of specific element
        int indexOfAli = names.indexOf("Ali");


        //print without any extra method
        System.out.println(names);

        // to remove everything from arrayList
        // names.clear();
    }
}
