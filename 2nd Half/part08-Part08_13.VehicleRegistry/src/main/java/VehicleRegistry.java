import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }
        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!(registry.containsKey(licensePlate))) {
            return false;
        }
        registry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate i : registry.keySet()) {
            System.out.println(i);
        }
    }

    public void printOwners() {
        ArrayList<String> rememberOwners = new ArrayList<>();
        for (String i : registry.values()) {
            if (rememberOwners.contains(i)) {
                continue;
            }
            rememberOwners.add(i);
            System.out.println(i);
        }
    }
}
