import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> item;

    public OneItemBox() {
        item = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        if (this.item.size() == 1) {
            return;
        }
        this.item.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.item.contains(item);
    }
}
