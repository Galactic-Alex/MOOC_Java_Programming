import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase i : suitcases) {
            totalWeight += i.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() > maxWeight) {
            return;
        }
        this.suitcases.add(suitcase);
    }

    public String toString() {
        int totalWeight = 0;
        for (Suitcase i : suitcases) {
            totalWeight += i.totalWeight();
        }
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase i : suitcases) {
            i.printItems();
        }
    }
}
