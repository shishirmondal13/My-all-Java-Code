package world.sports.cricket.icc.cricket.icc;

import java.util.*;

class SimplePlayer {
    private String name;
    private String type; // "National" or "Foreign"

    public SimplePlayer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return String.format("%-12s (%s)", name, type);
    }
}

 class SimpleTeamMaker {
    private List<List<SimplePlayer>> teams;

    public SimpleTeamMaker(List<String> nationalList, List<String> foreignList) {
        Collections.shuffle(nationalList);
        Collections.shuffle(foreignList);

        teams = new ArrayList<>();
        int nationalIndex = 0;
        int foreignIndex = 0;

        for (int t = 0; t < 5; t++) {
            List<SimplePlayer> team = new ArrayList<>();
            for (int i = 0; i < 2; i++) {
                team.add(new SimplePlayer(nationalList.get(nationalIndex++), "National"));
            }
            for (int i = 0; i < 3; i++) {
                team.add(new SimplePlayer(foreignList.get(foreignIndex++), "Foreign"));
            }
            teams.add(team);
        }
    }

    public void printTeams() {
        for (int i = 0; i < teams.size(); i++) {
            System.out.println("\nTeam " + (i + 1) + ":");
            for (SimplePlayer player : teams.get(i)) {
                System.out.println(player.toString());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nationalPlayers = new ArrayList<>();
        List<String> foreignPlayers = new ArrayList<>();

        System.out.print("Enter number of National players (min 10): ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter National player " + i + ": ");
            nationalPlayers.add(sc.nextLine());
        }

        System.out.print("Enter number of Foreign players (min 15): ");
        int f = sc.nextInt();
        sc.nextLine(); // Consume newline
        for (int i = 1; i <= f; i++) {
            System.out.print("Enter Foreign player " + i + ": ");
            foreignPlayers.add(sc.nextLine());
        }

        if (n < 10 || f < 15) {
            System.out.println("\n⚠️ Not enough players to form 5 teams (need at least 10 national and 15 foreign).");
            return;
        }

        SimpleTeamMaker teamMaker = new SimpleTeamMaker(nationalPlayers, foreignPlayers);
        teamMaker.printTeams();
    }
}

