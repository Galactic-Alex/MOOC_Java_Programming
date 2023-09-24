import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        changeHistory.add(status);
    }

    public void clear() {
        changeHistory.clear();
    }

    public double maxValue() {
        if (changeHistory.isEmpty()) {
            return 0;
        }
        double maxValue = 0;
        for (double i : changeHistory) {
            if (maxValue < i) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (changeHistory.isEmpty()) {
            return 0;
        }
        double minValue = changeHistory.get(0);
        for (double i : changeHistory) {
            if (minValue > i) {
                minValue = i;
            }
        }
        return minValue;
    }

    public double average() {
        if (changeHistory.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double i : changeHistory) {
            sum += i;
        }
        return sum / changeHistory.size();
    }

    @Override
    public String toString() {
        return changeHistory.toString();
    }
}
