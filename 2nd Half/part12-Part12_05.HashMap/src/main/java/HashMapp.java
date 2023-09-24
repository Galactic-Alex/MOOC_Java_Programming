import java.util.ArrayList;

public class HashMapp<K, V> {
    private ArrayList<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMapp() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (this.values[hashValue] == null) {
            return null;
        }
        for (int i = 0; i < values[hashValue].size(); i++) {
            if (values[hashValue].get(i).getKey().equals(key)) {
                return values[hashValue].get(i).getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        ArrayList<Pair<K, V>> listBasedOnKey = getListBasedOnKey(key);
        int index = getIndexOfKey(listBasedOnKey, key);
        if (index > 0) {
            listBasedOnKey.get(index).setValue(value);
        } else {
            listBasedOnKey.add(new Pair<>(key, value));
            firstFreeIndex++;
        }
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }
        return values[hashValue];
    }

    private int getIndexOfKey(ArrayList<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        ArrayList<Pair<K, V>>[] newArray = new ArrayList[this.values.length * 2];
        for (int i = 0; i < this.values.length; i++) {
            copy(newArray, i);
        }
        this.values = newArray;
    }

    private void copy(ArrayList<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].get(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }
            newArray[hashValue].add(value);
        }
    }

    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }

    public int size() {
        return firstFreeIndex;
    }
}
