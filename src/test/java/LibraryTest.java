import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LibraryTest {

    Library library;
    Book book;
    Publisher publisher;


    @Before
    public void before(){
         library = new Library("Children Library", 10);
         book = new Book(TitleType.HARRYPOTTER, GenreType.FANTASY);
         publisher = new Publisher("Swan");
         publisher.addBook(book);
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals (1, library.bookCount());

    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals (0, library.bookCount());

    }

    @Test
    public void canCollectBook(){
        publisher.addBook(book);
        library.collectBook(publisher);
        assertEquals (1, library.bookCount());
    }



}
