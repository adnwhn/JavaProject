package products;

public class BoardGame extends Product implements Game {
    int noMinPlayers;
    int noMaxPlayers;
    int minAge;
    String theme; // Abstract, Area control, Roll-and-move, Roll-and-write, Storytelling etc.

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

    public BoardGame() {}

    public BoardGame(int id, String title, double price, int noMinPlayers, int noMaxPlayers, int minAge, String theme) {
        super(id, title, price);
        setNoMinPlayers(noMinPlayers);
        setNoMaxPlayers(noMaxPlayers);
        setMinimumAge(minAge);
        this.theme = theme;
    }

    @Override
    public String classType() {
        return "BoardGame";
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price + "€" +
                ", noPlayers=" + noMinPlayers + "-" + noMaxPlayers +
                ", minAge=" + minAge +
                ", theme=" + theme +
                '}';
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

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
