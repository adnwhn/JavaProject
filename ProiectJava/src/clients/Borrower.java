package clients;

import utilities.Date;

import java.util.Objects;

public class Borrower extends Client {
    boolean annualCard;

    public Borrower() {}

    public Borrower(char genre, Date birthDate, String municipality, String personalCode, String firstName, String lastName, Date registrationDate, boolean annualCard) {
        super(genre, birthDate, municipality, personalCode, firstName, lastName, registrationDate);
        this.annualCard = annualCard;
        setDiscountPercentage();
    }

    public boolean getAnnualCard() {
        return annualCard;
    }

    public void setAnnualCard(boolean annualCard) {
        this.annualCard = annualCard;
    }

    @Override
    public void setDiscountPercentage() {
        if ( (registrationDate.getYear() >= 2016) && (registrationDate.getYear() < 2018) ) {
            this.discountPercentage = 5;
        } else if ( (registrationDate.getYear() >= 2012) && (registrationDate.getYear() < 2016) ) {
            this.discountPercentage = 10;
        } else { this.discountPercentage = 0; }

        if (annualCard) {
            this.discountPercentage = this.discountPercentage + 2;
        }
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationDate=" + registrationDate +
                ", annualCard=" + annualCard +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
