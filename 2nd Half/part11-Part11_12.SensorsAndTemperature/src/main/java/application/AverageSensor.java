package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensorList;
    private List<Integer> averageReadings;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.averageReadings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        int counter = 0;
        for (Sensor i : sensorList) {
            if (!i.isOn()) {
                counter++;
                break;
            }
        }
        if (counter == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        sensorList.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensorList.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (sensorList.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }
        averageReadings.add((int) sensorList.stream().mapToInt(Sensor::read).average().getAsDouble());
        return averageReadings.get(averageReadings.size() - 1);
    }

    public void addSensor(Sensor toAdd) {
        sensorList.add(toAdd);
    }

    public List<Integer> readings() {
        return averageReadings;
    }
}
