package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class Building extends Unit{
    ArrayList<Sensor> sensorList;
    ArrayList<Actuator> actuatorList;
    ArrayList<String> roomList;

    public Building (String name){
        super(name);
        sensorList = new ArrayList<Sensor>();
        actuatorList = new ArrayList<Actuator>();
        roomList = new ArrayList<String>();
    }


    public void addActuator(double value, String room){
        Actuator actuator = new Actuator(value , room );
        actuatorList.add(actuator);

    }

    public void removeActuator(String room){
        actuatorList.removeIf(actuator -> room == actuator.getName());
    }
    public void removeActuator(UUID id){
        actuatorList.removeIf(actuator -> id == actuator.getId());
    }
    public void addCO2Sensor (String room, String name){
        CO2Sensor co2Sensor = new CO2Sensor(room, name);
        sensorList.add(co2Sensor);
    }
    public void addTempSensor (String room, String name){
        TemperatureSensor temperatureSensor = new TemperatureSensor(room, name);
        sensorList.add(temperatureSensor);
    }
    public void removeSensor (String name){
        sensorList.removeIf(sensor -> name == sensor.getName());
    }

    public void removeSensor (UUID id){
        sensorList.removeIf(sensor -> id == sensor.getId());
    }
    public void showActuators(String name){
        for (Actuator actuator : actuatorList){
            if(actuator.getRoom() == name) {
                System.out.println(actuator.getName());
            }
        }
    }
    public void showActuators(){
        for(Actuator actuator : actuatorList){
            System.out.println(actuator.getName());
        }
    }
    public void showSensor(){
        for (Sensor sensor: sensorList){
            System.out.println(sensor.toString());
        }
    }
    public void showSensor(String name){
        for (Sensor sensor : sensorList){
            if(sensor.getRoom()==name){
                System.out.println(sensor.toString());
            }
        }
    }





}
