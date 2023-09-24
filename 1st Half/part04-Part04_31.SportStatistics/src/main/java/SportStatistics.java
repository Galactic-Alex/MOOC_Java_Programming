
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Team> teams = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] lineBreak = line.split(",");
                int score1 = Integer.parseInt(lineBreak[2]);
                int score2 = Integer.parseInt(lineBreak[3]);
                Team team1 = new Team(lineBreak[0], score1);
                Team team2 = new Team(lineBreak[1], score2);
                if (score1 > score2) {
                    team1.AddWins(1);
                    team2.AddLosses(1);
                } else {
                    team2.AddWins(1);
                    team1.AddLosses(1);
                }
                teams.add(team1);
                teams.add(team2);
            }
        } catch (Exception e) {
            System.out.println("Couldn't read file " + file);
        }
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int games = 0;
        int losses = 0;
        int wins = 0;
        for (Team i : teams) {
            if (teamName.equals(i.getName())) {
                games++;
                if (i.getLosses() == 1) {
                    losses++;
                } else {
                    wins++;
                }
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
