package day52;

//Set is a part of collection keep the objects without duplication
//collection of unique objects
public interface StringSet {

    void add(String s);

    void remove(String s);

    int size();

    //remove all String from StringSet
    void clear();

    boolean isEmpty();

    void print();
}
