import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cardList;

    public Hand() {
        this.cardList = new ArrayList<>();
    }

    public void add(Card card) {
        cardList.add(card);
    }

    public void print() {
        for (Card i : cardList) {
            System.out.println(i);
        }
    }

    public void sort() {
        Collections.sort(cardList);
    }

    public void sortBySuit() {
        cardList.sort(new BySuitInValueOrder());
    }

    public int getSum() {
        int sum = 0;
        for (Card i : cardList) {
            sum += i.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand o) {
        return this.getSum() - o.getSum();
    }

}
