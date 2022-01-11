import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower bob;
    private Book book;
    private Library library;

    @Before
    public void before() {
        bob = new Borrower("Bob");
        book = new Book("The Client", "John Grisham", "Thriller");
        library = new Library(3);
        library.addBook(book);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", bob.getName());
    }

    @Test
    public void canBorrowBook() {
        bob.borrowBook(book, library);
        assertEquals(0, library.getNumberOfBooks());
        assertEquals(1, bob.getNumberOfBooks());
    }
}
