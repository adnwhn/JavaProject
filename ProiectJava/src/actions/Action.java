package actions;

import clients.Client;
import utilities.Date;
import products.*;

public class Action {
    Date date;
    Product product;

    public Action() {}

    public Action(Date date, Product product) {
        this.date = date;
        this.product = product;
//        if(productName == "Album"){
//            this.product = new Album();
//            product =  (Album) product;
//        }else if(productName == "BoardGame"){
//            this.product = new BoardGame();
//            product = (BoardGame) product;
//        }else if(productName == "Book"){
//            this.product = new Book();
//            product = (Book) product;
//        }else if(productName == "Movie"){
//            this.product = new Movie();
//            product = (Movie) product;
//        }else if(productName == "VideoGame") {
//            this.product = new VideoGame();
//            product = (VideoGame) product;
//        }else {
//            System.out.println("Produs indisponibil!");
//        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Action{" + date +
                ", product=" + product +
                '}';
    }

}
