package products;

public class Movie extends Disk {
    int length;   // in minutes

    public Movie() {}

    public Movie(int id, String title, double price, char f, int length) {
        super(id, title, price, f);
        this.length = length;
    }

    @Override
    public String classType() {
        return "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price + "€" +
                ", format=" + format.getFormat() +
                ", length=" + length + " minutes" +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
