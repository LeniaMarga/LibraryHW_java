import java.util.ArrayList;

public class Publisher {

    private String publisherName;
    private ArrayList<Book> stock;

    public Publisher(String publisherName){
        this.publisherName = publisherName;
        this.stock = new ArrayList<> ();
    }

    public void addBook(Book book){
        this.stock.add(book);
    }

    public int bookCount(){
        return this.stock.size();
    }

    public Book removeBook(){
        return stock.remove(0);
    }

}
