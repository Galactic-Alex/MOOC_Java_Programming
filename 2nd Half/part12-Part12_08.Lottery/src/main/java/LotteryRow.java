
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random random = new Random();
        for (int amountOfNumber = 7; amountOfNumber > numbers.size();) {
            int randomNum = random.nextInt(40) + 1;
            if (!numbers.contains(randomNum)) {
                numbers.add(randomNum);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}

