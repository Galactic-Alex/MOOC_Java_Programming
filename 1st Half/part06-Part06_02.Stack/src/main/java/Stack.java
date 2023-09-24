import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public void add(String value) {
        values.add(value);
    }

    public ArrayList<String> values() {
        return this.values;
    }

    public String take() {
        String lastValue = values.get(values.size() - 1);
        values.remove(values.size() - 1);
        return lastValue;
    }
}
