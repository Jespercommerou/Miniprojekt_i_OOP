package src.com.company;

public class Sensor {
    private double SensorValue;
    private String room;

    public Sensor(String room) {
        this.room = room;
    }

    public double getSensorValue(String room) {
        return SensorValue;
    }
}
