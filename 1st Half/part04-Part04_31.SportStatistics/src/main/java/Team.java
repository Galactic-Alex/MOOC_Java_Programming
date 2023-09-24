public class Team {
    private String name;
    private int games;
    private int wins;
    private int losses;
    private int scores;

    public Team(String name, int scores) {
        this.name = name;
        this.scores = scores;
    }

    public void AddGames(int i) {
        if (i > 0) {
            this.games += i;
        }
    }

    public void AddWins(int i) {
        if (i > 0) {
            this.wins += i;
        }
    }

    public void AddLosses(int i) {
        if (i > 0) {
            this.losses += i;
        }
    }

    public int getGames() {
        return games;
    }

    public int getLosses() {
        return losses;
    }

    public int getWins() {
        return wins;
    }

    public String getName() {
        return name;
    }
}
