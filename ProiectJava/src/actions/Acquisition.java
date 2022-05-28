package actions;

public class Acquisition extends Action {

    public Acquisition() {}

    public Acquisition(int day, int month, int year, String productName) {
      //  super(day, month, year, productName);
    }

    @Override
    public String toString() {
        return "Acquisition{" +
                "date=" + date +
                ", product=" + product +
                '}';
    }
}
