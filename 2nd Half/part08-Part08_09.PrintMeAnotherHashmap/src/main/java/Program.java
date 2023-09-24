
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {

    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book i : hashmap.values()) {
            System.out.println(i);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book i : hashmap.values()) {
            if (i.getName().contains(text)) {
                System.out.println(i);
            }
        }
    }
}
