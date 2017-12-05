import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {

        book = new Book (TitleType.HARRYPOTTER, GenreType.FANTASY);
    }

    @Test
    public void canGetTitle() {
        assertEquals (TitleType.HARRYPOTTER, book.getTitle ( ));
    }

    @Test
    public void canGetGenre() {
        assertEquals (GenreType.FANTASY, book.getGenre ( ));
    }

    @Test
    public void canGetAllTitles() {
        TitleType[] titles = {TitleType.HARRYPOTTER, TitleType.PETERPAN, TitleType.FAIRYTAILS, TitleType.SONGBOOK};
        assertEquals (4, titles.length);


    }

}
