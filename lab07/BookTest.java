import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class BookTest {
    /**
     * Test wrong parameters for Book.make method returning null
     */
    @Test
    public void testMakeNull() {
        assertNull(Book.make(null, "title", "author", 1));
        assertNull(Book.make("SATIRE", null, "author", 1));
        assertNull(Book.make("SATIRE", "title", null, 1));
        assertNull(Book.make("SATIRE", "title", "author", 0));
        assertNull(Book.make("SATIRE", "title", "author", -1));
        assertNull(Book.make("SATIRE", "t", "author", 10));
        assertNull(Book.make("SATIRE", "title", "a", 10));
    }
    /**
     * Test for wrong genre string parameter yielding IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMakeWrongGenre() {
        Book.make("NOT_GENRE", "good param", "good param", 10);
    }
    /**
     * Test for author and title Strings not matching regex
     */
    @Test
    public void testWrongRegex() {
        assertNull(Book.make("SATIRE", "___", "author", 10));
        assertNull(Book.make("SATIRE", "title", "{}{}", 10));
    }

    /**
     * Test for correct Book creation and comparison
     */

    @Test
    public void testBookEquality(){
        Book b1 = Book.make("SATIRE", "title", "author", 10);
        Book b2 = Book.make("SATIRE", "title", "author", 10);
        Book b3 = Book.make("SATIRE", "not title", "author", 100);

        assertTrue(Book.isSameGenre(b1, b2));

        assertFalse(b1.equals(null));
        assertFalse(b1.equals(new Object()));
        assertFalse(b1.equals(b3));
        
        assertEquals(-1, b1.compare(b3));
        assertEquals(1, b3.compare(b1));
        assertEquals(0, b1.compare(b2));
        
        assertEquals(b1, b2);
    }
}
