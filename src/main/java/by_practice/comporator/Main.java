package by_practice.comporator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book A", "Author X", 2000, 10.44));
        books.add(new Book("Book B", "Author Y", 1995, 14.26));
        books.add(new Book("Book C", "Author Z", 2010, 14.42));
        books.add(new Book("Book D", "Author K", 2014, 11.26));

        books.sort(Comparator.comparing(Book::getPublicationYear));

        System.out.println("Sorted Books:");
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
