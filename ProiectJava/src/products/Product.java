package products;

import java.util.Objects;

public class Product {
    int id; // unic
    String title;
    double price; // euro (€)

    public String classType(){
        return "Product";
    }

    public Product() {}

    public Product(int id, String title, double price) {
        this.id = id;
        this.title=title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Product productToCompare = (Product) o;
        if ((productToCompare.getId() == this.id)
                && (productToCompare.getTitle() == this.title)
                && (productToCompare.getPrice() == this.price)) {
            return true;
        } else {
            return false;
        }
    }

}
