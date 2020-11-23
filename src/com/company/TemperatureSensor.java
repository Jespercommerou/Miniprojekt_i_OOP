package com.company;

public class TemperatureSensor extends Sensor {
    private double SensorValue;

    public TemperatureSensor (String room, String name) {
        super(room, name);

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
