package com.company;

public class TemperatureSensor extends Sensor {
    private double SensorValue;

    public TemperatureSensor (String room) {
        super(room);
    }

    public double getSensorValue() {
        return SensorValue;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "SensorValue=" + SensorValue +
                '}';
    }
}
