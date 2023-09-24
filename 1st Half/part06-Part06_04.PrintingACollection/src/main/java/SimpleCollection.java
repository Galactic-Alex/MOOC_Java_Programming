
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        StringBuilder elementsToString = new StringBuilder("");
        for (String i : elements) {
            elementsToString.append("\n").append(i);
        }
        if (elements.size() == 1) {
            return "The collection " + this.name + " has " + elements.size() + " element:" + elementsToString;
        }
        return "The collection " + this.name +  " has " + elements.size() + " elements:" + elementsToString;
    }
}
