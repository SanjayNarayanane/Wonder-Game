import java.util.*;
import java.io.*;

class Team {
    String name;
    int points;
    int runsScored;
    int ballsPlayed;
    int runsConceded;
    int ballsBowled;

    public Team(String name) {
        this.name = name;
        this.points = 0;
        this.runsScored = 0;
        this.ballsPlayed = 0;
        this.runsConceded = 0;
        this.ballsBowled = 0;
    }
}

public class IPLScoreboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] matchResults = new String[54];
        for (int i = 0; i < 54; i++) {
            matchResults[i] = br.readLine();
        }

        String[] rankings = new String[8];
        for (int i = 0; i < 8; i++) {
            rankings[i] = br.readLine();
        }

        ArrayList<Team> teams = new ArrayList<>();
        for (String ranking : rankings) {
            String[] parts = ranking.split(" ");
            teams.add(new Team(parts[1]));
        }

        for (String matchResult : matchResults) {
            String[] parts = matchResult.split(" ");
            String team1Name = parts[0];
            int team1Runs = Integer.parseInt(parts[1].split("/")[0]);
            int team1Wickets = Integer.parseInt(parts[1].split("/")[1]);
            int team1Balls = Integer.parseInt(parts[2]);
            String team2Name = parts[3];
            int team2Runs = Integer.parseInt(parts[4].split("/")[0]);
            int team2Wickets = Integer.parseInt(parts[4].split("/")[1]);
            int team2Balls = Integer.parseInt(parts[5]);

            Team team1 = findTeam(teams, team1Name);
            Team team2 = findTeam(teams, team2Name);

            if (team1Runs > team2Runs) {
                team1.points += 2;
            } else if (team2Runs > team1Runs) {
                team2.points += 2;
            }

            team1.runsScored += team1Runs;
            team1.ballsPlayed += team1Balls;
            team1.runsConceded += team2Runs;
            team1.ballsBowled += team2Balls;

            team2.runsScored += team2Runs;
            team2.ballsPlayed += team2Balls;
            team2.runsConceded += team1Runs;
            team2.ballsBowled += team1Balls;
        }

        ArrayList<String> outcomes = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                Team team1 = teams.get(i);
                Team team2 = teams.get(j);

                // Simulate the match between team1 and team2
                int team1Wins = simulateMatch(team1, team2);
                int team2Wins = simulateMatch(team2, team1);

                // Update team points
                if (team1Wins > team2Wins) {
                    team1.points += 2;
                } else if (team2Wins > team1Wins) {
                    team2.points += 2;
                }

                // Calculate and update Net Run Rate (NRR)
                double team1NRR = (team1.runsScored - team1.runsConceded) / (team1.ballsPlayed / 6.0);
                double team2NRR = (team2.runsScored - team2.runsConceded) / (team2.ballsPlayed / 6.0);

                // Update NRR
                team1NRR = Math.round(team1NRR * 100.0) / 100.0;
                team2NRR = Math.round(team2NRR * 100.0) / 100.0;
                team1.points += team1NRR;
                team2.points += team2NRR;

                outcomes.add("WIN:" + team1.name + "|LOSE:" + team2.name + "||" + "WIN:" + team2.name + "|LOSE:" + team1.name);
            }
        }

        Collections.sort(outcomes);
        for (String outcome : outcomes) {
            System.out.println(outcome);
        }
    }

    private static Team findTeam(ArrayList<Team> teams, String name) {
        for (Team team : teams) {
            if (team.name.equals(name)) {
                return team;
            }
        }
        return null;
    }

    private static int simulateMatch(Team team1, Team team2) {
        int team1Wins = 0;
        int totalMatches = 2;
        int margin = 1;

        while (team1.points <= (totalMatches - margin) && team2.points <= (totalMatches - margin)) {
            team1.runsScored += 1;
            team1.ballsPlayed += 6;
            team2.runsConceded += 1;
            team2.ballsBowled += 6;

            // Calculate NRR after this run
            double team1NRR = (team1.runsScored - team1.runsConceded) / (team1.ballsPlayed / 6.0);
            double team2NRR = (team2.runsScored - team2.runsConceded) / (team2.ballsPlayed / 6.0);

            if (team1NRR > team2NRR) {
                team1Wins++;
            }
        }

        return team1Wins;
    }
}