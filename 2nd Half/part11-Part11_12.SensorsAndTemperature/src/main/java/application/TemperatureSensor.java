package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean state;

    public TemperatureSensor() {
        state = false;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setOn() {
        state = true;
    }

    @Override
    public void setOff() {
        state = false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Sensor is off");
        }
        return new Random().nextInt(61) - 30;
    }
}
