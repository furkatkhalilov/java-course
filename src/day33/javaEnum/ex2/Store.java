package day33.javaEnum.ex2;

import java.util.ArrayList;

public class Store {

    public ArrayList<Book> getBooks() {
        ArrayList<Book> list = new ArrayList<>();
        Book book1 = new Book("To Kill Mockinbird", BookCategory.NOVEL);
        Book book2 = new Book("Investing 101", BookCategory.ECONOMY);
        Book book3 = new Book("Neuromancer", BookCategory.FICTION);
        Book book4 = new Book("Leila Mecnun", BookCategory.CLASSIC);
        Book book5 = new Book("The Witcher", BookCategory.FANTASY);

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        return list;
    }

}
