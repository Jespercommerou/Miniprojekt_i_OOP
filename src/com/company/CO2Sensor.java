package src.com.company;

public class CO2Sensor extends Sensor {
    private double co2Value;

    @Override
    public double getSensorValue() {
        return super.getSensorValue();
    }

    @Override
    public String toString() {
        return "CO2Sensor{" +
                "co2Value=" + co2Value +
                '}';
    }
}
