package products;

public class Book extends Product {
    String author;
    int noPages;


    public Book() {}

    public Book(int id, String title, String author, double price, int noPages) {
        super(id, title, price);
        this.author = author;
        this.noPages = noPages;

    }

    @Override
    public String classType() {
        return "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price + "€" +
                ", noPages=" + noPages +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoPages() {
        return noPages;
    }

    public void setNoPages(int noPages) {
        this.noPages = noPages;
    }
}
