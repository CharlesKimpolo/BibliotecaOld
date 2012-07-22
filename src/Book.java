
public class Book {
    String title;
    String author;
    String isbn;
    Boolean reserved;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.reserved = false;
    }

    public String displayBookInfo() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
}

    public void markAsReserved() {
        reserved = true;
    }

    public boolean isReserved() {
        return reserved;
    }
}
