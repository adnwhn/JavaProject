package services;

import actions.Action;
import clients.Client;
import products.Product;
import utilities.Date;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Service {
    DBProductsService productsService = new DBProductsService();
    ClientsService clientsService = new ClientsService();
    ActionsService actionsService = new ActionsService();
    Audit audit = new Audit();

    public String getFile() {
        return audit.getFile();
    }

    public Service() throws SQLException {
    }

    //productsService
    public void addProduct(Product productToAdd) {
        productsService.addProduct(productToAdd);
        audit.log("Add");
    }

    public void deleteProduct(Product productToDelete) {
        productsService.deleteProduct(productToDelete);
        audit.log("Delete");
    }

    public void deleteProductById(int id) {
        productsService.deleteProductById(id);
        audit.log("Delete");
    }

    public void deleteProductByTitle(String title) {
        productsService.deleteProductByTitle(title);
        audit.log("Delete");
    }

    public ArrayList<Product> getAllProducts(){
        audit.log("Get");
        return productsService.getAllProducts();

    }

    public Product getProductById(int id) {
        audit.log("Get");
        return productsService.getProductById(id);
    }

    public Product getProductByTitle(String title) {
        audit.log("Get");
        return productsService.getProductByTitle(title);
    }

    public void changeTitleByTitle(String initialTitle, String newTitle) {
        audit.log("Update");
        productsService.changeTitleByTitle(initialTitle, newTitle);
    }

    public void changeTitleById(int id, String newTitle) {
        audit.log("Update");
        productsService.changeTitleById(id, newTitle);
    }

    public void priceUpById(int id) {
        audit.log("Update");
        productsService.priceUpById(id);
    }

    public void priceUpByTitle(String title) {
        audit.log("Update");
        productsService.priceUpByTitle(title);
    }

    //clientsService
    public void addClient(Client clientToAdd) {
        audit.log("Add");
        clientsService.addClient(clientToAdd);
    }

    public void deleteClient(Client clientToDelete) {
        audit.log("Delete");
        clientsService.deleteClient(clientToDelete);
    }

    public void deleteClientById(String id) {
        audit.log("Delete");
        clientsService.deleteClientById(id);
    }

    public void deleteClientByName(String firstName, String lastName) {
        audit.log("Delete");
        clientsService.deleteClientByName(firstName, lastName);
    }

    public Client getClientById(String id) {
        audit.log("Get");
        return clientsService.getClientById(id);
    }

    public Client getClientByName(String firstName, String lastName) {
        audit.log("Get");
        return clientsService.getClientByName(firstName, lastName);
    }

    public void changeFirstName(String initialFirstName, String newFirstName) {
        audit.log("Update");
        clientsService.changeFirstName(initialFirstName, newFirstName);
    }

    public void changeLastName(String initialLastName, String newLastName) {
        audit.log("Update");
        clientsService.changeLastName(initialLastName, newLastName);
    }

    //actionsService
    public void addFile(Action actionToAdd, Client clientToAdd) {
        audit.log("Add");
        actionsService.addFile(actionToAdd, clientToAdd);
    }

    public void deleteFile(Action actionToDelete) {
        audit.log("Delete");
        actionsService.deleteFile(actionToDelete);
    }

    public void deleteFileByProduct(Product productToDelete) {
        audit.log("Delete");
        actionsService.deleteFileByProduct(productToDelete);
    }

    public void deleteFileByDate(Date dateToDelete) {
        audit.log("Delete");
        actionsService.deleteFileByDate(dateToDelete);
    }

}
