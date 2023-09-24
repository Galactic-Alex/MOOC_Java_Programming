import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!storage.containsKey(unit)) {
            storage.put(unit, new ArrayList<>());
        }
        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!storage.containsKey(storageUnit) || storage.get(storageUnit).isEmpty()) {
            return new ArrayList<>();
        }
        return storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        storage.get(storageUnit).remove(item);
        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String i : storage.keySet()) {
            if (i.isEmpty()) {
                continue;
            }
            storageUnits.add(i);
        }
        return storageUnits;
    }
}
