package products;

public class VideoGame extends Disk implements Game {
    int noMinPlayers;
    int noMaxPlayers;
    int minAge;
    String device; // computer, xbox, psp etc.
    String category; // singleplayer/multiplayer

    @Override
    public String classType() {
        return "VideoGame";
    }

    @Override
    public void setNoMinPlayers(int noMinPlayers) {
        this.noMinPlayers = noMinPlayers;
    }

    @Override
    public void setNoMaxPlayers(int noMaxPlayers) {
        this.noMaxPlayers = noMaxPlayers;
    }

    @Override
    public void setMinimumAge(int minAge) {
        this.minAge = minAge;
    }

    public VideoGame() {}

    public VideoGame(int id, String title, double price, char f, int noMinPlayers, int noMaxPlayers, int minAge, String device) {
        super(id, title, price, f);
        setNoMinPlayers(noMinPlayers);
        setNoMaxPlayers(noMaxPlayers);
        setMinimumAge(minAge);
        this.device = device;
        if (noMaxPlayers == 1) {
            category = "singleplayer";
        } else if (noMinPlayers != 1 && noMaxPlayers > 1) {
            category = "multiplayer";
        } else  if (noMinPlayers == 1 && noMaxPlayers != 1) {
            category = "singleplayer & multiplayer";
        }
    }

    @Override
    public String toString() {
        if(category == "multiplayer" ||  category == "singleplayer & multiplayer") {
        return "VideoGame{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price + "€" +
                ", format=" + format.getFormat() +
                ", category=" + category +
                ", noPlayers=" + noMinPlayers + "-" + noMaxPlayers +
                ", minAge=" + minAge +
                ", device=" + device +
                '}';
        }else if (category == "singleplayer") {
            return "VideoGame{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", price=" + price + "€" +
                    ", format=" + format.getFormat() +
                    ", category=" + category +
                    ", minAge=" + minAge +
                    ", device=" + device +
                    '}';
        } else {
            return "Eroare!";
        }
    }

    public int getNoMinPlayers() {
        return noMinPlayers;
    }

    public int getNoMaxPlayers() {
        return noMaxPlayers;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
