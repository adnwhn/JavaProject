package services;

import products.Product;
import java.util.ArrayList;

public interface ProductsInterface {
        // CREATE
        public void addProduct(Product productToAdd);

        // DELETE
        public void deleteProduct(Product productToDelete);
        public void deleteProductById(int id);
        public void deleteProductByTitle(String title);

        // READ
        public ArrayList<Product> getAllProducts();
        public Product getProductById(int id);
        public Product getProductByTitle(String title);

        // UPDATE
        public void changeTitleByTitle(String initialTitle, String newTitle);
        public void changeTitleById(int id, String newTitle);
        public void priceUpById(int id);
        public void priceUpByTitle(String title);

}
