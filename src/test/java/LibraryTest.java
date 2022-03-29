import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book bookTwo;
    private Book bookThree;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("Lord of The Rings: The Fellowship of the Ring", "J.R.R. Tolkien", "Fantasy");
        bookTwo = new Book("Lord of The Rings: The Two Towers", "J.R.R. Tolkien", "Fantasy");
        bookThree = new Book("Lord of The Rings: The Return of the King", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void libraryHasStock() {
        assertEquals(0, library.getStock());
    }

    @Test
    public void canAddBook() {
    library.add(book);
    assertEquals(1, library.getStock());
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void cannotExceedCapacity() {
        library.add(book);
        library.add(bookTwo);
        library.add(bookThree);
        assertEquals(2, library.getStock());
    }

}

