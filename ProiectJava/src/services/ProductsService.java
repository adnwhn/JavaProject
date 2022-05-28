package services;

import products.*;
import java.util.ArrayList;

public class ProductsService implements ProductsInterface {
    ArrayList<Product> products;

    public ProductsService() { products = new ArrayList<>(); }

    // CREATE
    public void addProduct(Product productToAdd) { products.add(productToAdd); }

    // DELETE
    public void deleteProduct(Product productToDelete) { products.remove(productToDelete); }

    public void deleteProductById(int id) { products.removeIf(productInArray -> productInArray.getId() == id); }

    public void deleteProductByTitle(String title) { products.removeIf(productInArray -> productInArray.getTitle() == title); }

    // READ
    public ArrayList<Product> getAllProducts(){
        return products;
    }

    public Product getProductById(int id){
        for (Product productInArray : products) {
            if(productInArray.getId() == id){
                return productInArray;
            }
        }
        return null;
    }

    public Product getProductByTitle(String title){
        for (Product productInArray : products) {
            if(productInArray.getTitle().equalsIgnoreCase(title)){
                return productInArray;
            }
        }
        return null;
    }

    // UPDATE
    public void changeTitleByTitle(String initialTitle, String newTitle){
        for (Product productInArray : products) {
            if(productInArray.getTitle().equalsIgnoreCase(initialTitle)){
                productInArray.setTitle(newTitle);
            }
        }
    }

    public void changeTitleById(int id, String newTitle){
        for (Product productInArray : products) {
            if(productInArray.getId() == id){
                productInArray.setTitle(newTitle);
            }
        }
    }

    public void priceUpById(int id){
        for (Product productInArray : products) {
            if(productInArray.getId() == id){
                productInArray.setPrice(productInArray.getPrice()+1);
            }
        }
    }

    public void priceUpByTitle(String title){
        for (Product productInArray : products) {
            if(productInArray.getTitle().equalsIgnoreCase(title)){
                productInArray.setPrice(productInArray.getPrice()+1);
            }
        }
    }

}
