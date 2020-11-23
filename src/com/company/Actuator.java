package com.company;

public class Actuator extends Unit
{
    private String room;
    private double actuatorValue;
    Actuator(String name, String room, double actuatorValue)
    {
        super(name);
        this.room = room;
        this.actuatorValue = actuatorValue;
    }

    Actuator(double actuatorValue, String room, String name)
    {
        super(name);
        this.actuatorValue = actuatorValue;
        this.room = room;
    }
    Actuator(double actuatorValue, String name)
    {
        super(name);
        this.actuatorValue = actuatorValue;
    }

    public void setActuatorValue(double actuatorValue)
    {
        this.actuatorValue = actuatorValue;
    }

    public double getActuatorValue()
    {
        return actuatorValue;
    }

    public String getRoom() {
        return room;
    }
}
