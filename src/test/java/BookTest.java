import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Chasm City", "Alastair Reynolds", "Science Fiction");
    }

    @Test
    public void hasTitle() {
        assertEquals("Chasm City", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Alastair Reynolds", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Science Fiction", book.getGenre());
    }

}
