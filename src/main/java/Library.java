import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<> ();
    }

    public void addBook(Book book){
        if (bookCount()< capacity){
        this.books.add(book);}
    }

    public int bookCount(){
        return this.books.size();
    }

    public Book removeBook(){
          return this.books.remove(0);
    }

    public void collectBook(Publisher publisher){
          Book book = publisher.removeBook();
          addBook(book);
    }



}



