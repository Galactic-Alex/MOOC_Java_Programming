import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> movablesList;

    public Herd() {
        this.movablesList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Movable i : movablesList) {
            string.append(i).append("\n");
        }
        return string.toString();
    }

    public void addToHerd(Movable movable) {
        movablesList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable i : movablesList) {
            i.move(dx, dy);
        }
    }
}
