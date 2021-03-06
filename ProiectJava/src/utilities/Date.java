package utilities;

import java.util.Objects;

public class Date {
    // format YY/MM/DD
    private int year;
    private int month;
    private int day;

    public Date() {}

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return  year +
                "/" + month +
                "/" + day;
    }

    @Override
    public boolean equals(Object o) {
        Date dateToCompare = (Date) o;
        if ((dateToCompare.getYear() == this.year)
                && (dateToCompare.getMonth() == this.month)
                && (dateToCompare.getDay() == this.day)) {
            return true;
        } else { return false; }

    }

}
