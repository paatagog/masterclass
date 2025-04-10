import java.util.*;

public class LMS {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        this.books.add(b);
    }

    public void removeBook(Book b) {
        this.books.remove(b);
    }

    public void printInfo() {
        for (Book b: books) {
            System.out.println("Name: " + b.getName() + "; Author: " + b.getAuthor() + "; Year: " + b.getYear());
        }
    }

}
