package actions;

public class Rental extends Action {

    public Rental() {}

    public Rental(int day, int month, int year, String productName) {
       // super(day, month, year, productName);
    }

    @Override
    public String toString() {
        return "Rental{" +
                "date=" + date +
                ", product=" + product +
                '}';
    }
}
