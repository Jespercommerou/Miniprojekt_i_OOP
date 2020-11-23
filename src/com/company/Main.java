package com.company;

public class Main {

    public static void main(String[] args) {
        MainSystem system = new MainSystem();

        system.addBuilding("MMMI");

        System.out.println(system.buildingList.get(0).getName());

        system.buildingList.get(0).addTempSensor("Studierum", "TempSensor");
        system.buildingList.get(0).addCO2Sensor("Studierum 2", "Temp sensor");
        system.buildingList.get(0).addActuator(20, "Ventilationsaktuator");

        system.buildingList.get(0).showSensor();
        system.buildingList.get(0).showActuators();

    }
}
