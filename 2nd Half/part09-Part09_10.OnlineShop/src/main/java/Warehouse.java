import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;

    public Warehouse() {
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        priceMap.put(product, price);
        stockMap.put(product, stock);
    }

    public int price(String product) {
        if (!priceMap.containsKey(product)) {
            return -99;
        }
        return priceMap.get(product);
    }

    public int stock(String product) {
        if (!stockMap.containsKey(product)) {
            return 0;
        }
        return stockMap.get(product);
    }

    public boolean take(String product) {
        if (!stockMap.containsKey(product) || stockMap.get(product) == 0) {
            return false;
        }
        stockMap.replace(product, stockMap.get(product) - 1);
        return true;
    }

    public Set<String> products() {
        return new HashSet<>(stockMap.keySet());
    }
}
