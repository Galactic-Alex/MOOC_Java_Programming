import java.util.ArrayList;

public class BirdCollection {
    private ArrayList<Bird> birdCollection;

    public BirdCollection() {
        this.birdCollection = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        birdCollection.add(bird);
    }

    public ArrayList<Bird> getBirdCollection() {
        return birdCollection;
    }

    public Bird getBird(int index) {
        return birdCollection.get(index);
    }
}
