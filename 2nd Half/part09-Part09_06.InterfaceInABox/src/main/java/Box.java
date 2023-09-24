import java.util.ArrayList;

public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> boxContents;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        boxContents = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (weight() + packable.weight() <= maxWeight) {
            boxContents.add(packable);
        }
    }

    public double weight() {
        double currentWeight = 0;
        for (Packable i : boxContents) {
            currentWeight += i.weight();
        }
        return currentWeight;
    }

    @Override
    public String toString() {
        return "Box: " + boxContents.size() + " items, total weight " + weight() + " kg";
    }
}
