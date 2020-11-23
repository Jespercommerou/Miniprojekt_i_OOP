package com.company;

public class Actuator
{
    private String room;
    private double actuatorValue;

    Actuator(double actuatorValue, String room)
    {
        this.actuatorValue = actuatorValue;
        this.room = room;
    }
    Actuator(double actuatorValue)
    {
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
}
