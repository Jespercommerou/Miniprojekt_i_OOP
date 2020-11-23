package src.com.company;

public class CO2Sensor extends Sensor {
    private double co2Value;

    public CO2Sensor (String room, double co2Value) {
        super(room);
        this.co2Value = co2Value;
    }

    @Override
    public double getSensorValue(String room) {
        return super.getSensorValue(room);
    }

    @Override
    public String toString() {
        return "CO2Sensor{" +
                "co2Value=" + co2Value +
                '}';
    }
}
