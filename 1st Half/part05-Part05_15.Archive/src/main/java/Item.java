import java.util.Objects;

public class Item {
    private String identifier;
    private String name;

    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return this.identifier.equals(item.identifier);
    }

}
