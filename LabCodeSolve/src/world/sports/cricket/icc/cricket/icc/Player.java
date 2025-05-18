package world.sports.cricket.icc.cricket.icc;

import java.util.Locale;

public class Player {
    private String playerRegID;
    private String name;
    private int jerseyNo;
    private Locale country;

    public Player(String playerRegID, String name, int jerseyNo, Locale country) {
        this.playerRegID = playerRegID;
        this.name = name;
        this.jerseyNo = jerseyNo;
        this.country = country;
    }

    public String getPlayerRegID() { return playerRegID; }
    public void setPlayerRegID(String playerRegID) { this.playerRegID = playerRegID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getJerseyNo() { return jerseyNo; }
    public void setJerseyNo(int jerseyNo) { this.jerseyNo = jerseyNo; }

    public Locale getCountry() { return country; }
    public void setCountry(Locale country) { this.country = country; }

    public String toString() {
        return "**************** Player Info: ****************" +
                "\nICC Reg ID: " + this.playerRegID +
                "\nName: " + this.name +
                "\nJersey No.: " + this.jerseyNo +
                "\nNationality: " + this.country.getCountry() + "\n";
    }
}
