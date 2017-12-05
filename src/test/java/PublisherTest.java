import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PublisherTest {

    Publisher publisher;
    Book book;

    @Before
    public void before(){
        this.book = new Book(TitleType.HARRYPOTTER, GenreType.FANTASY);
        this.publisher = new Publisher ("Swan");
    }

    @Test
    public void addBookToStock(){
        publisher.addBook(book);
        assertEquals(1, publisher.bookCount());
    }

    @Test
    public void removeBookFromStock(){
        publisher.addBook(book);
        Book bookToLibrary = publisher.removeBook ();
        assertEquals(0, publisher.bookCount());
    }

}
