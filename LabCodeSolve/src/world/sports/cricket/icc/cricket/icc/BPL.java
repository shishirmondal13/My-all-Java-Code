package world.sports.cricket.icc.cricket.icc;

import java.util.*;

public class BPL {

    public static void main(String[] args) {
        Locale australia = new Locale("English", "AU");
        Locale bangladesh = new Locale("Bengali", "BD");
        Locale england = new Locale("English", "UK");
        Locale southAfrica = new Locale("English", "ZA");
        Locale pakistan = new Locale("Urdu", "PK");
        Locale sriLanka = new Locale("Sinhalese", "LK");

        List<Team> bplTeamList = new ArrayList<>();
        bplTeamList.add(new Team("BPL-1", "Dhaka Dominators", "Sabbir Khan", new ArrayList<>()));
        bplTeamList.add(new Team("BPL-2", "Chattogram Challengers", "Mehedi Hasan", new ArrayList<>()));
        bplTeamList.add(new Team("BPL-3", "Sylhet Strikers", "Tanzim Rahman", new ArrayList<>()));

        List<Player> bplForeignPlayerList = new ArrayList<>();
        List<Player> bplLocalPlayerList = new ArrayList<>();

        bplForeignPlayerList.add(new Player("F-01", "Alex", 8, australia));
        bplForeignPlayerList.add(new Player("F-02", "Ben", 56, australia));
        bplForeignPlayerList.add(new Player("F-03", "Charlie", 63, england));
        bplForeignPlayerList.add(new Player("F-04", "David", 33, england));
        bplForeignPlayerList.add(new Player("F-05", "Ethan", 45, southAfrica));
        bplForeignPlayerList.add(new Player("F-06", "Frank", 20, southAfrica));
        bplForeignPlayerList.add(new Player("F-07", "Gayan", 13, sriLanka));
        bplForeignPlayerList.add(new Player("F-08", "Hiran", 7, sriLanka));
        bplForeignPlayerList.add(new Player("F-09", "Imran", 56, pakistan));
        bplForeignPlayerList.add(new Player("F-10", "Javed", 97, pakistan));

        bplLocalPlayerList.add(new Player("L-01", "Kamal", 75, bangladesh));
        bplLocalPlayerList.add(new Player("L-02", "Liton", 28, bangladesh));
        bplLocalPlayerList.add(new Player("L-03", "Munna", 16, bangladesh));
        bplLocalPlayerList.add(new Player("L-04", "Nabil", 90, bangladesh));
        bplLocalPlayerList.add(new Player("L-05", "Omar", 52, bangladesh));
        bplLocalPlayerList.add(new Player("L-06", "Parvez", 32, bangladesh));
        bplLocalPlayerList.add(new Player("L-07", "Quazi", 8, bangladesh));
        bplLocalPlayerList.add(new Player("L-08", "Rafiq", 18, bangladesh));
        bplLocalPlayerList.add(new Player("L-09", "Sabbir", 30, bangladesh));
        bplLocalPlayerList.add(new Player("L-10", "Tariq", 21, bangladesh));

        Collections.shuffle(bplForeignPlayerList);
        Collections.shuffle(bplLocalPlayerList);

        int numTeams = bplTeamList.size();
        for (int i = 0; i < bplForeignPlayerList.size(); i++) {
            bplTeamList.get(i % numTeams).getPlayerList().add(bplForeignPlayerList.get(i));
        }
        for (int i = 0; i < bplLocalPlayerList.size(); i++) {
            bplTeamList.get(i % numTeams).getPlayerList().add(bplLocalPlayerList.get(i));
        }

        for (Team team : bplTeamList) {
            System.out.println(team);
        }
    }
}
