package world.sports.cricket.icc.cricket.icc;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamRegID;
    private String name;
    private String owner;
    private List<Player> playerList = new ArrayList<>();

    public Team(String teamRegID, String name, String owner, List<Player> playerList) {
        this.teamRegID = teamRegID;
        this.name = name;
        this.owner = owner;
        this.playerList = playerList;
    }

    public String getTeamRegID() { return teamRegID; }
    public void setTeamRegID(String teamRegID) { this.teamRegID = teamRegID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public List<Player> getPlayerList() { return playerList; }
    public void setPlayerList(List<Player> playerList) { this.playerList = playerList; }

    public String toString() {
        StringBuilder info = new StringBuilder("**************** Team Info: ****************\n");
        info.append("ICC Reg ID: ").append(this.teamRegID)
                .append("\nName: ").append(this.name)
                .append("\nOwner: ").append(this.owner)
                .append("\n**************** Players List: ****************\n\n");

        for (Player player : playerList) {
            info.append(player.toString());
        }

        return info.toString();
    }
}
