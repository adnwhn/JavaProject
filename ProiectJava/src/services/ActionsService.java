package services;

import actions.Action;
import clients.Client;
import products.Product;
import utilities.Date;

import java.util.HashMap;

public class ActionsService {
    HashMap<Action, Client> files;

    ActionsService(){ files = new HashMap<>(); }

    //CREATE
    public void addFile(Action actionToAdd, Client clientToAdd){
        files.put(actionToAdd, clientToAdd);
    }

    //DELETE
    public void deleteFile(Action actionToDelete) {
        files.remove(actionToDelete);
    }

    public void deleteFileByProduct(Product productToDelete){
        for (Action action : files.keySet()) {
            if (action.getProduct().equals(productToDelete)){
                files.remove(action);
            }
        }
    }

    public void deleteFileByDate(Date dateToDelete){
        for (Action action : files.keySet()) {
            if (action.getDate().equals(dateToDelete)){
                files.remove(action);
            }
        }
    }

}
