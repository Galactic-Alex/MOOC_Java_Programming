
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String nextItem = scanner.nextLine();
            if (nextItem.equals("")) {
                break;
            }
            Item i = new Item(nextItem);
            items.add(i);
        }
        for (Item i : items) {
            System.out.println(i);
        }
    }
}
