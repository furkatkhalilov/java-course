package day31.protectedModifier.other;

import day31.protectedModifier.same.Book;

public class MySubBook extends Book {

    public static void main(String[] args) {
        MySubBook subBook = new MySubBook();
        subBook.name = "Lord Of The Rings";
        subBook.print();
    }
}
