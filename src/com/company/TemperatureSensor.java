package com.company;

public class TemperatureSensor {
    private double SensorValue;

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
