import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.hasCapacity()) {
            this.books.add(book);
        }
    }

    private boolean hasCapacity() {
        return this.books.size() < this.capacity;
    }


    public boolean removeBook(Book book) {
        return this.books.remove(book);
    }
}
