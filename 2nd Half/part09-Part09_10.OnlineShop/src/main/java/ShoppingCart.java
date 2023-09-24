import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);
        if (itemList.contains(item)) {
            for (Item i : itemList) {
                if (i.equals(item)) {
                    i.increaseQuantity();
                }
            }
        } else {
            itemList.add(item);
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Item i : itemList) {
            totalPrice += i.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item i : itemList) {
            System.out.println(i);
        }
    }

}
