import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> Debts;

    public IOU() {
        this.Debts = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        Debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        Double temp = (double) 0;
        return Debts.getOrDefault(toWhom, temp);
    }
}
