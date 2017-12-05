import java.util.ArrayList;

public class Book {

    private TitleType title;
    private GenreType genre;

    public Book(TitleType title, GenreType genre){
        this.title = title;
        this.genre = genre;
    }

    public TitleType getTitle(){
        return this.title; }


    public GenreType getGenre() {
        return this.genre; }


}
