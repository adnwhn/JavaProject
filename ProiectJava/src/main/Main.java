package main;

import products.*;
import services.Service;

import java.io.*;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Service service = new Service();
            Scanner myObj = new Scanner(System.in);
            while (true) {
            System.out.println("Choose package:\n" +
                    "1. Products\n" +
                    "2. Clients\n" +
                    "3. Actions\n");

            int packageNo = myObj.nextInt();

            if (packageNo == 1) {
                System.out.println("You've chosen Products!\n"
                        + "Now, choose what to do:\n"
                        + "1. addProduct\n"
                        + "2. deleteProduct\n"
                        + "3. deleteProductById\n"
                        + "4. deleteProductByTitle\n"
                        + "5. getAllProducts\n"
                        + "6. getProductById\n"
                        + "7. getProductByTitle\n"
                        + "8. changeTitleByTitle\n"
                        + "9. changeTitleById\n"
                        + "10. priceUpById\n"
                        + "11. priceUpByTitle\n");

                int actionNo = myObj.nextInt();

                if (actionNo == 1) {
                    System.out.println("Insert productToAdd:\n"
                            + "1. Album\n"
                            + "2. BoardGame\n"
                            + "3. Book\n"
                            + "4. Movie\n"
                            + "5. VideoGame\n");
                    int no = myObj.nextInt();
                    if (no == 1) {
                        System.out.println("Insert id:");
                        int id = myObj.nextInt();
                        System.out.println("Insert title:");
                        myObj.nextLine();
                        String title = myObj.nextLine();
                        System.out.println("Insert price:");
                        double price = myObj.nextDouble();
                        System.out.println("Insert format(C/D/B/V):");
                        char format = myObj.next().charAt(0);
                        System.out.println("Insert genre:");
                        myObj.nextLine();
                        String genre = myObj.nextLine();

                        Product productToAdd = new Album(id, title, price, format, genre);
                        service.addProduct(productToAdd);
                        System.out.println("Album added!");
                    } else if (no == 2) {
                        System.out.println("Insert id:");
                        int id = myObj.nextInt();
                        System.out.println("Insert title:");
                        myObj.nextLine();
                        String title = myObj.nextLine();
                        System.out.println("Insert price:");
                        double price = myObj.nextDouble();
                        System.out.println("Insert noMinPlayers:");
                        int noMinPlayers = myObj.nextInt();
                        System.out.println("Insert noMaxPlayers:");
                        int noMaxPlayers = myObj.nextInt();
                        System.out.println("Insert minAge:");
                        int minAge = myObj.nextInt();
                        System.out.println("Insert theme:");
                        myObj.nextLine();
                        String theme = myObj.nextLine();

                        Product productToAdd = new BoardGame(id, title, price, noMinPlayers, noMaxPlayers, minAge, theme);
                        service.addProduct(productToAdd);
                        System.out.println("BoardGame added!");
                    } else if (no == 3) {
                        System.out.println("Insert id:");
                        int id = myObj.nextInt();
                        System.out.println("Insert title:");
                        myObj.nextLine();
                        String title = myObj.nextLine();
                        System.out.println("Insert author:");
                        myObj.nextLine();
                        String author = myObj.nextLine();
                        System.out.println("Insert price:");
                        double price = myObj.nextDouble();
                        System.out.println("Insert noPages:");
                        int noPages = myObj.nextInt();

                        Product productToAdd = new Book(id, title, author, price, noPages);
                        service.addProduct(productToAdd);
                        System.out.println("Book added!");
                    } else if (no == 4) {
                        System.out.println("Insert id:");
                        int id = myObj.nextInt();
                        System.out.println("Insert title:");
                        myObj.nextLine();
                        String title = myObj.nextLine();
                        System.out.println("Insert price:");
                        double price = myObj.nextDouble();
                        System.out.println("Insert format(C/D/B/V):");
                        char format = myObj.next().charAt(0);
                        System.out.println("Insert length:");
                        int length = myObj.nextInt();

                        Product productToAdd = new Movie(id, title, price, format, length);
                        service.addProduct(productToAdd);
                        System.out.println("Movie added!");
                    } else if (no == 5) {
                        System.out.println("Insert id:");
                        int id = myObj.nextInt();
                        System.out.println("Insert title:");
                        myObj.nextLine();
                        String title = myObj.nextLine();
                        System.out.println("Insert price:");
                        double price = myObj.nextDouble();
                        System.out.println("Insert format(C/D/B/V):");
                        char format = myObj.next().charAt(0);
                        System.out.println("Insert noMinPlayers:");
                        int noMinPlayers = myObj.nextInt();
                        System.out.println("Insert noMaxPlayers:");
                        int noMaxPlayers = myObj.nextInt();
                        System.out.println("Insert minAge:");
                        int minAge = myObj.nextInt();
                        System.out.println("Insert device:");
                        myObj.nextLine();
                        String device = myObj.nextLine();

                        Product productToAdd = new VideoGame(id, title, price, format, noMinPlayers, noMaxPlayers, minAge, device);
                        service.addProduct(productToAdd);
                        System.out.println("VideoGame added!");
                    }
                } else if (actionNo == 2) {
                    System.out.println("Insert productToDelete:\n"
                            + "1. Album\n"
                            + "2. BoardGame\n"
                            + "3. Book\n"
                            + "4. Movie\n"
                            + "5. VideoGame\n");
                    int no = myObj.nextInt();
                    if (no == 1) {
                        System.out.println("Insert id:");
                        int id = myObj.nextInt();
                        System.out.println("Insert title:");
                        myObj.nextLine();
                        String title = myObj.nextLine();
                        System.out.println("Insert price:");
                        double price = myObj.nextDouble();
                        System.out.println("Insert format(C/D/B/V):");
                        char format = myObj.next().charAt(0);
                        System.out.println("Insert genre:");
                        myObj.nextLine();
                        String genre = myObj.nextLine();

                        Product productToDelete = new Album(id, title, price, format, genre);
                        service.deleteProduct(productToDelete);
                        System.out.println("Album deleted!");
                    } else if (no == 2) {
                        System.out.println("Insert id:");
                        int id = myObj.nextInt();
                        System.out.println("Insert title:");
                        myObj.nextLine();
                        String title = myObj.nextLine();
                        System.out.println("Insert price:");
                        double price = myObj.nextDouble();
                        System.out.println("Insert noMinPlayers:");
                        int noMinPlayers = myObj.nextInt();
                        System.out.println("Insert noMaxPlayers:");
                        int noMaxPlayers = myObj.nextInt();
                        System.out.println("Insert minAge:");
                        int minAge = myObj.nextInt();
                        System.out.println("Insert theme:");
                        myObj.nextLine();
                        String theme = myObj.nextLine();

                        Product productToDelete = new BoardGame(id, title, price, noMinPlayers, noMaxPlayers, minAge, theme);
                        service.deleteProduct(productToDelete);
                        System.out.println("BoardGame deleted!");
                    } else if (no == 3) {
                        System.out.println("Insert id:");
                        int id = myObj.nextInt();
                        System.out.println("Insert title:");
                        myObj.nextLine();
                        String title = myObj.nextLine();
                        System.out.println("Insert author:");
                        myObj.nextLine();
                        String author = myObj.nextLine();
                        System.out.println("Insert price:");
                        double price = myObj.nextDouble();
                        System.out.println("Insert noPages:");
                        int noPages = myObj.nextInt();

                        Product productToDelete = new Book(id, title, author, price, noPages);
                        service.deleteProduct(productToDelete);
                        System.out.println("Book deleted!");
                    } else if (no == 4) {
                        System.out.println("Insert id:");
                        int id = myObj.nextInt();
                        System.out.println("Insert title:");
                        myObj.nextLine();
                        String title = myObj.nextLine();
                        System.out.println("Insert price:");
                        double price = myObj.nextDouble();
                        System.out.println("Insert format(C/D/B/V):");
                        char format = myObj.next().charAt(0);
                        System.out.println("Insert length:");
                        int length = myObj.nextInt();

                        Product productToDelete = new Movie(id, title, price, format, length);
                        service.deleteProduct(productToDelete);
                        System.out.println("Movie deleted!");
                    } else if (no == 5) {
                        System.out.println("Insert id:");
                        int id = myObj.nextInt();
                        System.out.println("Insert title:");
                        myObj.nextLine();
                        String title = myObj.nextLine();
                        System.out.println("Insert price:");
                        double price = myObj.nextDouble();
                        System.out.println("Insert format(C/D/B/V):");
                        char format = myObj.next().charAt(0);
                        System.out.println("Insert noMinPlayers:");
                        int noMinPlayers = myObj.nextInt();
                        System.out.println("Insert noMaxPlayers:");
                        int noMaxPlayers = myObj.nextInt();
                        System.out.println("Insert minAge:");
                        int minAge = myObj.nextInt();
                        System.out.println("Insert device:");
                        myObj.nextLine();
                        String device = myObj.nextLine();

                        Product productToDelete = new VideoGame(id, title, price, format, noMinPlayers, noMaxPlayers, minAge, device);
                        service.deleteProduct(productToDelete);
                        System.out.println("VideoGame deleted!");
                    }
                } else if (actionNo == 3) {
                    System.out.println("Insert id:\n");
                    int id = myObj.nextInt();
                    service.deleteProductById(id);
                    System.out.println("Produs sters!");
                } else if (actionNo == 4) {
                    System.out.println("Insert title:\n");
                    String title = myObj.nextLine();
                    service.deleteProductByTitle(title);
                } else if (actionNo == 5) {
                    System.out.println("All products are:\n");
                    ArrayList<Product> products = service.getAllProducts();
                    products.stream().forEach(System.out::println);
                } else if (actionNo == 6) {
                    System.out.println("Insert id:\n");
                    int id = myObj.nextInt();
                    service.getProductById(id);
                } else if (actionNo == 7) {
                    System.out.println("Insert title:\n");
                    String title = myObj.nextLine();
                    service.getProductByTitle(title);
                } else if (actionNo == 8) {
                    System.out.println("Insert initialTitle:");
                    myObj.nextLine();
                    String initialTitle = myObj.nextLine();
                    System.out.println("Insert newTitle:");

                    String newTitle = myObj.nextLine();

                    service.changeTitleByTitle(initialTitle, newTitle);
                    System.out.println("Title changed!");
                } else if (actionNo == 9) {
                    System.out.println("Insert id:\n");
                    int id = myObj.nextInt();
                    System.out.println("Insert newTitle:\n");
                    String newTitle = myObj.nextLine();
                    service.changeTitleById(id, newTitle);
                } else if (actionNo == 10) {
                    System.out.println("Insert id:\n");
                    int id = myObj.nextInt();
                    service.priceUpById(id);
                } else if (actionNo == 11) {
                    System.out.println("Insert title:\n");
                    String title = myObj.nextLine();
                    service.priceUpByTitle(title);
                }
            } else if (packageNo == 2) {
                System.out.println("You've chosen Clients!\n"
                        + "Now, choose what to do:\n"
                        + "1. addClient\n"
                        + "2. deleteClient\n"
                        + "3. deleteClientById\n"
                        + "4. deleteClientByName\n"
                        + "5. getClientById\n"
                        + "6. getClientByName\n"
                        + "7. changeFirstName\n"
                        + "8. changeLastName\n");

                int actionNo = myObj.nextInt();


            } else if (packageNo == 3) {
                System.out.println("You've chosen Actions!\n"
                        + "Now, choose what to do:\n");
            } else {
                System.out.println("Invalid number!");
            }
        }
        }catch(SQLException e){
            System.out.println("Eroare la conexiunea cu baza de date!");
            e.printStackTrace();
        }
    }
}
