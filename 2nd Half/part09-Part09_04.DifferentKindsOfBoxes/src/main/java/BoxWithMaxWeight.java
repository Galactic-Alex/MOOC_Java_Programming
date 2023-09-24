import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int weightSum = 0;
        for (Item i : items) {
            weightSum += i.getWeight();
        }
        if (weightSum + item.getWeight() > capacity) {
            return;
        }
        items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
