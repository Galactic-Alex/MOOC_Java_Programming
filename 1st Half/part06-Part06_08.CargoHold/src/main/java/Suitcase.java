import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;

    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        if (totalWeight + item.getWeight() > maxWeight) {
            return;
        }
        items.add(item);
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        if (this.items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        }
        return items.size() + " items (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item i : items) {
            if (heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }
}
