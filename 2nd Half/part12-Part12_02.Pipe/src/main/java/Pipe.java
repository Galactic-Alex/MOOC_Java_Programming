import java.util.ArrayList;

public class Pipe<T> {
    ArrayList<T> pipeList;

    public Pipe() {
        this.pipeList = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipeList.add(value);
    }

    public T takeFromPipe() {
        if (pipeList.isEmpty()) {
            return null;
        }
        T tempHolder = pipeList.get(0);
        pipeList.remove(0);
        return tempHolder;
    }

    public boolean isInPipe() {
        return !pipeList.isEmpty();
    }
}
