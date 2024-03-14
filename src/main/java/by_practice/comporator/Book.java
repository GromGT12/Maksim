package by_practice.comporator;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private Integer pubicationYear;

    public Book(String title, String author, Integer pubicationYear) {
        this.title = title;
        this.author = author;
        this.pubicationYear = pubicationYear;
    }


    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.pubicationYear, otherBook.pubicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pubicationYear=" + pubicationYear +
                '}';
    }
}
