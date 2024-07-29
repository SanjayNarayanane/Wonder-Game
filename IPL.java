import java.util.*;
import java.util.regex.*;

class Team {
    String name;
    int points;
    int totalRuns;
    int totalBalls;
    int totalWickets;

    public Team(String name) {
        this.name = name;
        points = 0;
        totalRuns = 0;
        totalBalls = 0;
        totalWickets = 0;
    }
}

public class ipl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Team> teams = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            teams.add(new Team(sc.nextLine()));
        }

        for (int i = 0; i < 54; i++) {
            String matchResult = sc.nextLine();
            String[] parts = matchResult.split(" ");
            String team1Name = parts[0];
            String team2Name = parts[3];
            int team1Runs = Integer.parseInt(parts[1].split("/")[0]);
            int team2Runs = Integer.parseInt(parts[4].split("/")[0]);
            int team1Balls = Integer.parseInt(parts[5]);
            int team2Balls = Integer.parseInt(parts[2].split("/")[1]);
            int team2Wickets = Integer.parseInt(parts[2].split("/")[0]);

            Team team1 = null;
            Team team2 = null;

            for (Team team : teams) {
                if (team.name.equals(team1Name)) {
                    team1 = team;
                } else if (team.name.equals(team2Name)) {
                    team2 = team;
                }
            }

            team1.totalRuns += team1Runs;
            team1.totalBalls += team1Balls;
            team2.totalRuns += team2Runs;
            team2.totalBalls += team2Balls;
            team2.totalWickets += team2Wickets;

            if (team1Runs > team2Runs) {
                team1.points += 2;
            } else if (team2Runs > team1Runs) {
                team2.points += 2;
            } else {
                team1.points += 1;
                team2.points += 1;
            }
        }

        Collections.sort(teams, (team1, team2) -> {
            if (team1.points == team2.points) {
                return Integer.compare(calculateNRR(team2), calculateNRR(team1));
            }
            return Integer.compare(team2.points, team1.points);
        });

        Team team3 = teams.get(4);
        Team team4 = teams.get(5);

        List<String> outcomes = new ArrayList<>();

        // Simulate the two remaining matches
        for (int win1 = 0; win1 <= 2; win1++) {
            int win2 = 2 - win1;
            team3.points += win1 * 2;
            team4.points += win2 * 2;
            int nrr1 = calculateNRR(team3);
            int nrr2 = calculateNRR(team4);

            if (nrr1 > nrr2) {
                outcomes.add("WIN:" + team3.name + "|LOSE:" + team4.name + "||" + teams.get(0).name + "," + teams.get(1).name + "," + teams.get(2).name + "," + teams.get(3).name + "," + teams.get(4).name + "," + teams.get(5).name + "," + teams.get(6).name + "," + teams.get(7).name);
            } else if (nrr2 > nrr1) {
                outcomes.add("WIN:" + team4.name + "|LOSE:" + team3.name + "||" + teams.get(0).name + "," + teams.get(1).name + "," + teams.get(2).name + "," + teams.get(3).name + "," + teams.get(4).name + "," + teams.get(5).name + "," + teams.get(6).name + "," + teams.get(7).name);
            }
            team3.points -= win1 * 2;
            team4.points -= win2 * 2;
        }

        Collections.sort(outcomes);
        for (String outcome : outcomes) {
            System.out.println(outcome);
        }
    }

    private static int calculateNRR(Team team) {
        int runsDifference = team.totalRuns - (team.totalBalls / 6);
        return runsDifference;
    }
}