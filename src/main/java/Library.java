import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getStock() {
        return this.stock.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(Book book) {
        if (this.stock.size() < this.capacity) {
            this.stock.add(book);
        }
    }

    public Book lendBook() {
       return this.stock.remove(0);
    }


}
