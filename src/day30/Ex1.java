package day30;

class Book {
    String name;
    int publishYear;

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.publishYear);
    }
}

public class Ex1 {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Harry Potter";
        book1.publishYear = 2001;
        book1.print();
    }
}
