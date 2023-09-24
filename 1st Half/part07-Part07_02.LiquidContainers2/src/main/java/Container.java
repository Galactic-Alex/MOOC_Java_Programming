public class Container {
    private int contains;

    public Container() {
        this.contains = 0;
    }

    public int contains() {
        return contains;
    }

    public void add(int amount) {
        if (amount + contains > 100) {
            contains = 100;
        } else if (amount > 0) {
            contains += amount;
        }
    }

    public void remove(int amount) {
        if (contains - amount < 0) {
            contains = 0;
        } else if (amount > 0) {
            contains -= amount;
        }
    }

    @Override
    public String toString() {
        return this.contains + "/100";
    }
}
