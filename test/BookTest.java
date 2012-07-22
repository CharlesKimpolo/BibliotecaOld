import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class BookTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldBeAbleToDisplayBookInfo() throws Exception {
        assertEquals("Title: title1, Author: author1, ISBN: isbn1", new Book("title1","author1","isbn1").displayBookInfo());
        assertEquals("Title: title2, Author: author2, ISBN: isbn2", new Book("title2","author2","isbn2").displayBookInfo());
    }

    @Test
    public void shouldBeAbleToDetermineIfBookIsReserved() throws Exception {
        Book book = new Book("bookTitle","bookAuthor", "bookIsbn");
        book.markAsReserved();
        assertEquals(true, book.isReserved());
    }
}
