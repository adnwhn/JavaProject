package products;

public class Album extends Disk {
    String genre;

    public Album() {}

    public Album(int id, String title, double price, char f, String genre) {
        super(id, title, price, f);
        this.genre = genre;
    }

    @Override
    public String classType() {
        return "Album";
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price + "€" +
                ", format=" + format.getFormat() +
                 ", genre=" + genre +
                '}';
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
