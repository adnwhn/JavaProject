package services;

import clients.*;
import java.util.ArrayList;

public class ClientsService {
    ArrayList<Client> clients;

    public ClientsService() { clients = new ArrayList<>(); }

    //CREATE
    public void addClient(Client clientToAdd) {clients.add(clientToAdd);}

    //DELETE
    public void deleteClient(Client clientToDelete) {clients.remove(clientToDelete);}

    public void deleteClientById(String id) {clients.removeIf(clientInArray -> clientInArray.getId() == id); }

    public void deleteClientByName(String firstName, String lastName) {clients.removeIf(clientInArray -> ( clientInArray.getFirstName() == firstName && clientInArray.getLastName() == lastName ) ); }

    //READ
    public Client getClientById(String id) {
        for (Client clientInArray : clients) {
            if (clientInArray.getId() == id){
                return clientInArray;
            }
        }
        return null;
    }

    public Client getClientByName(String firstName, String lastName){
        for (Client clientInArray : clients) {
            if (clientInArray.getFirstName() == firstName
                    && clientInArray.getLastName() == lastName){
                return clientInArray;
            }
        }
        return null;
    }

    //UPDATE
    public void changeFirstName(String initialFirstName, String newFirstName){
        for (Client clientInArray : clients){
            if (clientInArray.getFirstName() == initialFirstName){
                clientInArray.setFirstName(newFirstName);
            }
        }
    }
    public void changeLastName(String initialLastName, String newLastName){
        for (Client clientInArray : clients){
            if (clientInArray.getLastName() == initialLastName){
                clientInArray.setLastName(newLastName);
            }
        }
    }

}
