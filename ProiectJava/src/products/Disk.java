package products;

import utilities.Format;

public class Disk extends Product {
    Format format;

    public Disk() {}

    public Disk(int id, String title, double price, char f) {
        super(id, title, price);
        if(f == 'C'){
            this.format = Format.C;
        }else if(f == 'D'){
            this.format = Format.D;
        }else if(f == 'B'){
            this.format = Format.B;
        }else if(f == 'V'){
            this.format = Format.V;
        }else {
            System.out.println("Format gresit!");
        }

    }

    public String getFormat() {
        return format.getFormat();
    }

    @Override
    public String classType() {
        return "Disk";
    }

    @Override
    public String toString() {
        return "Disk{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price + "€" +
                ", format=" + format.getFormat() +
                '}';
    }

}
