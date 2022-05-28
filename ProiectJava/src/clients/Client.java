package clients;

import utilities.Date;

import java.util.Objects;

public class Client {
    char genre; // even number for female; odd number for male
    Date birthDate;
    String municipality; // 2 digits code for municipality
    String personalCode; // 4 digits code
    String firstName;
    String lastName;
    Date registrationDate;

    String id;
    char genreChar; // F for female, M for male
    int discountPercentage;

    public Client() {}

    public Client(char genre, Date birthDate, String municipality, String personalCode, String firstName, String lastName, Date registrationDate) {
        this.genre = genre;
        this.birthDate = birthDate;
        this.municipality = municipality;
        this.personalCode = personalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationDate = registrationDate;
        setGenreChar(genre);
        setId(genre, birthDate, municipality, personalCode);
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(char genre, Date birthDate, String municipality, String personalCode) {
        this.id = Character.toString(genre);
        String  y, m, d;

        if ( (String.valueOf(birthDate.getYear()).length()) == 4 ) {
            y = String.valueOf(birthDate.getYear()).substring(2);
            this.id = this.id + y;
        } else if ( (String.valueOf(birthDate.getYear()).length()) == 2) {
            y = String.valueOf(birthDate.getYear());
            this.id = this.id + y;
        }

        if ( (String.valueOf(birthDate.getMonth()).length()) == 1 ) {
            m = "0" + String.valueOf(birthDate.getMonth());
            this.id = this.id + m;
        } else if ( (String.valueOf(birthDate.getMonth()).length()) == 2) {
            m = String.valueOf(birthDate.getMonth());
            this.id = this.id + m;
        }

        if ( (String.valueOf(birthDate.getDay()).length()) == 1 ) {
            d = "0" + String.valueOf(birthDate.getDay());
            this.id = this.id + d;
        } else if ( (String.valueOf(birthDate.getDay()).length()) == 2) {
            d = String.valueOf(birthDate.getDay());
            this.id = this.id + d;
        }

        this.id = this.id + municipality + personalCode;
    }

    public char getGenreChar() {
        return genreChar;
    }

    public void setGenreChar(int genre) {
        if (genre % 2 == 0){
            this.genreChar = 'F';
        } else {
            this.genreChar = 'M';
        }
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage() {}

    @Override
    public boolean equals(Object o) {
        Client clientToCompare = (Client) o;
        if (clientToCompare.getId() == this.id
                && clientToCompare.getFirstName() == this.firstName
                && clientToCompare.getLastName() == this.lastName
                && clientToCompare.getRegistrationDate().equals(this.registrationDate) ) {
            return true;
        } else { return false; }
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }

}
