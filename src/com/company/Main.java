package com.company;

public class Main {

    public static void main(String[] args) {
        MainSystem system = new MainSystem();

        system.addBuilding("MMMI");

        Building MMMI = system.buildingList.get(0);

        System.out.println(MMMI.getName());

        MMMI.addTempSensor("Studierum", "TempSensor");
        MMMI.addCO2Sensor("Studierum 2", "Temp sensor");
        MMMI.addActuator(20, "Ventilationsaktuator");


        MMMI.showSensor();
        MMMI.showActuators();

        MMMI.removeSensor("TempSensor");

        Actuator vent = MMMI.actuatorList.get(0);

        vent.setActuatorValue(10);

        System.out.println(vent.getActuatorValue());


        system.showBuildings();

        System.out.println(MMMI.sensorList.get(0).getSensorValue("TempSensor"));
    }
}
