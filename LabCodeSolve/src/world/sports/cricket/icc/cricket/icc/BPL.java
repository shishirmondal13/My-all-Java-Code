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
        bplTeamList.add(new Team("BPL-001", "Dhaka Dominators", "Sabbir Khan", new ArrayList<>()));
        bplTeamList.add(new Team("BPL-002", "Chattogram Challengers", "Mehedi Hasan", new ArrayList<>()));
        bplTeamList.add(new Team("BPL-003", "Sylhet Strikers", "Tanzim Rahman", new ArrayList<>()));

        List<Player> bplForeignPlayerList = new ArrayList<>();
        List<Player> bplLocalPlayerList = new ArrayList<>();

        bplForeignPlayerList.add(new Player("ICC-001", "Mitchel Marsh", 8, australia));
        bplForeignPlayerList.add(new Player("ICC-002", "Mitchel Starc", 56, australia));
        bplForeignPlayerList.add(new Player("ICC-003", "Josh Buttler", 63, england));
        bplForeignPlayerList.add(new Player("ICC-004", "Mark Wood", 33, england));
        bplForeignPlayerList.add(new Player("ICC-005", "Heinrich Klaasen", 45, southAfrica));
        bplForeignPlayerList.add(new Player("ICC-006", "Anrich Nortje", 20, southAfrica));
        bplForeignPlayerList.add(new Player("ICC-007", "Kushal Mendis", 13, sriLanka));
        bplForeignPlayerList.add(new Player("ICC-008", "Dasun Shanaka", 7, sriLanka));
        bplForeignPlayerList.add(new Player("ICC-009", "Babar Azam", 56, pakistan));
        bplForeignPlayerList.add(new Player("ICC-010", "Haris Rauf", 97, pakistan));

        bplLocalPlayerList.add(new Player("BD-001", "Shakib Al Hasan", 75, bangladesh));
        bplLocalPlayerList.add(new Player("BD-002", "Tamim Iqbal", 28, bangladesh));
        bplLocalPlayerList.add(new Player("BD-003", "Litton Das", 16, bangladesh));
        bplLocalPlayerList.add(new Player("BD-004", "Taskin Ahmed", 90, bangladesh));
        bplLocalPlayerList.add(new Player("BD-005", "Mustafizur Rahman", 52, bangladesh));
        bplLocalPlayerList.add(new Player("BD-006", "Mehidy Hasan Miraz", 32, bangladesh));
        bplLocalPlayerList.add(new Player("BD-007", "Afif Hossain", 8, bangladesh));
        bplLocalPlayerList.add(new Player("BD-008", "Najmul Hossain Shanto", 18, bangladesh));
        bplLocalPlayerList.add(new Player("BD-009", "Mahmudullah Riyad", 30, bangladesh));
        bplLocalPlayerList.add(new Player("BD-010", "Nasum Ahmed", 21, bangladesh));

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
