import java.lang.String;

public class Book {
    String bookName;
    String authorName;

    public Book(String bookName, String authorName) {
        this.authorName = authorName;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return authorName + "-" + bookName;
    }
}


