package com.company;

public class Sensor extends Unit {
    private double SensorValue;
    private String room;

    public Sensor(String name, String room) {
        super(name);
        this.room = room;
    }

    public double getSensorValue(String room) {
        return SensorValue;
    }

    public String getRoom() {
        return room;
    }
}
