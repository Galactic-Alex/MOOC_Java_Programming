import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokeList;

    public JokeManager() {
        this.jokeList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokeList.add(joke);
    }

    public String drawJoke() {
        System.out.println("Drawing a joke.");
        if (jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        int index = draw.nextInt(jokeList.size());
        return jokeList.get(index);
    }

    public void printJokes() {
        System.out.println("Printing jokes:");
        for (String i : jokeList) {
            System.out.println(i);
        }
    }
}
