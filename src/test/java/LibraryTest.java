import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1, book2, book3, book4;
    private Library library;

    @Before
    public void before() {
        library = new Library(3);
        book1 = new Book("Chasm City", "Alastair Reynolds", "Science Fiction");
        book2 = new Book("Night Shift", "Stephen King", "Horror");
        book3 = new Book("The Client", "John Grisham", "Thriller");
        book4 = new Book("Dune", "Frank Herbert", "Science Fiction");
    }

    @Test
    public void libraryIsEmpty() {
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void cannotAddBookIfStockIsFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.getNumberOfBooks());
    }

    @Test
    public void hasTwoSciFiOneHorrorBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book4);
        assertEquals(2, library.numberOfBooksByGenre("Science Fiction"));
        assertEquals(1, library.numberOfBooksByGenre("Horror"));
    }

}
