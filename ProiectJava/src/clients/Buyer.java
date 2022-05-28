package clients;

import utilities.Date;

public class Buyer extends Client {

    public Buyer() {}

    public Buyer(char genre, Date birthDate, String municipality, String personalCode, String firstName, String lastName, Date registrationDate) {
        super(genre, birthDate, municipality, personalCode, firstName, lastName, registrationDate);
        setDiscountPercentage();
    }

    @Override
    public void setDiscountPercentage() {
        if ( (registrationDate.getYear() >= 2016) && (registrationDate.getYear() < 2018) ) {
            this.discountPercentage = 2;
        } else if ( (registrationDate.getYear() >= 2012) && (registrationDate.getYear() < 2016) ) {
            this.discountPercentage = 7;
        } else { this.discountPercentage = 0; }
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationDate=" + registrationDate +
                ", discountPercentage=" + discountPercentage +
                "%}";
    }
}
