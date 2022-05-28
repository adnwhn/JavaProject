package services;

import products.*;
import utilities.DBConnection;
import products.Product;
import utilities.Format;

import java.sql.*;


import java.util.ArrayList;

public class DBProductsService implements ProductsInterface {
    Connection connection;

    public DBProductsService() throws SQLException {
        this.connection = DBConnection.getInstance();
    }

    // CREATE
    @Override
    public void addProduct(Product productToAdd) {
        if (productToAdd.classType() == "Album") {
            String query = "insert into Products (id, product, title, price, diskFormat, genre) values (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, productToAdd.getId());
                preparedStatement.setString(2, "Album");
                preparedStatement.setString(3, productToAdd.getTitle());
                preparedStatement.setDouble(4, productToAdd.getPrice());
                preparedStatement.setString(5, ((Album) productToAdd).getFormat());
                preparedStatement.setString(6, ((Album) productToAdd).getGenre());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {e.printStackTrace();}
        } else if (productToAdd.classType() == "BoardGame") {
            String query = "insert into Products (id, product, title, price, noMinPlayers, noMaxPlayers, minAge, theme) values (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, productToAdd.getId());
                preparedStatement.setString(2, "BoardGame");
                preparedStatement.setString(3, productToAdd.getTitle());
                preparedStatement.setDouble(4, productToAdd.getPrice());
                preparedStatement.setInt(5, ((BoardGame) productToAdd).getNoMinPlayers());
                preparedStatement.setInt(6, ((BoardGame) productToAdd).getNoMaxPlayers());
                preparedStatement.setInt(7, ((BoardGame) productToAdd).getMinAge());
                preparedStatement.setString(8, ((BoardGame) productToAdd).getTheme());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {e.printStackTrace();}
        } else if (productToAdd.classType() == "Book") {
            String query = "insert into Products (id, product, title, author, price, noPages) values (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, productToAdd.getId());
                preparedStatement.setString(2, "Book");
                preparedStatement.setString(3, productToAdd.getTitle());
                preparedStatement.setString(4, ((Book) productToAdd).getAuthor());
                preparedStatement.setDouble(5, productToAdd.getPrice());
                preparedStatement.setDouble(6, ((Book) productToAdd).getNoPages());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {e.printStackTrace();}
        } else if (productToAdd.classType() == "Movie") {
            String query = "insert into Products (id, product, title, price, diskFormat, lengthInMinutes) values (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, productToAdd.getId());
                preparedStatement.setString(2, "Movie");
                preparedStatement.setString(3, productToAdd.getTitle());
                preparedStatement.setDouble(4, productToAdd.getPrice());
                preparedStatement.setString(5, ((Movie) productToAdd).getFormat());
                preparedStatement.setInt(6, ((Movie) productToAdd).getLength());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {e.printStackTrace();}
        } else if (productToAdd.classType() == "VideoGame") {
            String query = "insert into Products (id, product, title, price, diskFormat, noMinPlayers, noMaxPlayers, minAge, device) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, productToAdd.getId());
                preparedStatement.setString(2, "VideoGame");
                preparedStatement.setString(3, productToAdd.getTitle());
                preparedStatement.setDouble(4, productToAdd.getPrice());
                preparedStatement.setString(5, ((VideoGame) productToAdd).getFormat());
                preparedStatement.setInt(6, ((VideoGame) productToAdd).getNoMinPlayers());
                preparedStatement.setInt(7, ((VideoGame) productToAdd).getNoMaxPlayers());
                preparedStatement.setInt(8, ((VideoGame) productToAdd).getMinAge());
                preparedStatement.setString(9, ((VideoGame) productToAdd).getDevice());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {e.printStackTrace();}
        }

    }

    // DELETE
    @Override
    public void deleteProduct(Product productToDelete) {

    }

    @Override
    public void deleteProductById(int id) {
        String query = "delete from Products where id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {e.printStackTrace();}
    }

    @Override
    public void deleteProductByTitle(String title) {

    }

    // READ
    @Override
    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> products = new ArrayList<>();
        String query = "select * from products";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String product = resultSet.getString(2);
                String title = resultSet.getString(3);
                String author = resultSet.getString(4);
                double price = resultSet.getDouble(5);
                String diskFormat = resultSet.getString(6);
                Format f = Format.C;
                int lengthInMinutes = resultSet.getInt(7);
                String genre = resultSet.getString(8);
                int noPages = resultSet.getInt(9);
                int noMinPlayers = resultSet.getInt(10);
                int noMaxPlayers = resultSet.getInt(11);
                int minAge = resultSet.getInt(12);
                String theme = resultSet.getString(13);
                String device = resultSet.getString(14);
                if(product.equals("Album")){
                    products.add(new Album(id, title, price, f.returnCharFormat(diskFormat), genre));
                }else if(product == "BoardGame"){
                    products.add(new BoardGame(id, title, price, noMinPlayers, noMaxPlayers, minAge, theme));
                }else if(product == "Book"){
                    products.add(new Book(id, title, author, price, noPages));
                }else if(product == "Movie"){
                    products.add(new Movie(id, title, price, f.returnCharFormat(diskFormat), lengthInMinutes));
                }else if(product == "VideoGame"){
                    products.add(new VideoGame(id, title, price, f.returnCharFormat(diskFormat), noMinPlayers, noMaxPlayers, minAge, device));
                }

            }
        } catch (SQLException e) {e.printStackTrace();}
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public Product getProductByTitle(String title) {
        return null;
    }

    // UPDATE
    @Override
    public void changeTitleByTitle(String initialTitle, String newTitle) {
        String query = "update products set title = ? where title = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, newTitle);
            preparedStatement.setString(2, initialTitle);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {e.printStackTrace();}
    }

    @Override
    public void changeTitleById(int id, String newTitle) {

    }

    @Override
    public void priceUpById(int id) {

    }

    @Override
    public void priceUpByTitle(String title) {

    }
}
