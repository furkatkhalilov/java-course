package day52;

import java.util.ArrayList;
import java.util.List;

//
public class SimpleStringSet implements StringSet {
    //1. way just create set >_>

    //2. way
    List<String> list = new ArrayList<>();

    //3. way
    // Item{
    //  Item next;
    //  String val;
    // }

    @Override
    public void add(String s) {
        if(list.contains(s)) {
            throw new RuntimeException("Duplication in set not allowed");
        }

        list.add(s);
    }

    @Override
    public void remove(String s) {
        list.remove(s);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void print() {
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "SimpleStringSet{" + list + '}';
    }
}
