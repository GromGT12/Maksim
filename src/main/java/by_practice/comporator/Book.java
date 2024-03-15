package by_practice.comporator;
import java.util.*;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private Integer publicationYear;
    private double price;

    public Book(String title, String author, Integer publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public static int getPublicationYear(Book book) {
        return book.publicationYear;
    }

    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.publicationYear, otherBook.publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
