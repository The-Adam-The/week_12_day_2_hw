import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {


    private Library library;
    private Book book;
    private Borrower james;

    @Before
    public void before() {
        james = new Borrower("James");
        library = new Library(2);
        book = new Book("Lord of The Rings: The Fellowship of the Ring", "J.R.R. Tolkien", "Fantasy");
        library.add(book);
    }

    @Test
    public void borrowerHasName() {
        assertEquals("James", james.getName());
    }

    @Test
    public void borrowerHasCollection() {
        assertEquals(0, james.bookCount());
    }

    @Test
    public void canBorrowBook() {
        james.borrowBook(library);
        assertEquals(1, james.bookCount() );
    }

}
