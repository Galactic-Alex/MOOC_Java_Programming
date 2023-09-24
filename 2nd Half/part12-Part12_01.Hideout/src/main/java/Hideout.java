public class Hideout<T> {
    private T t;

    public Hideout() {
        t = null;
    }

    public void putIntoHideout(T toHide) {
        this.t = toHide;
    }

    public T takeFromHideout() {
        T temp = t;
        t = null;
        return temp;
    }

    public boolean isInHideout() {
        return t != null;
    }
}
