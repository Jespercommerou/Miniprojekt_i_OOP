package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class Building extends Unit{
    private ArrayList<Sensor> sensorList;
    private ArrayList<Actuator> actuatorList;
    private ArrayList<String> roomList;

    public Building (String name){
        super(name);
        ArrayList<Sensor> sensorList = new ArrayList<Sensor>();
        ArrayList<Actuator> actuatorList = new ArrayList<Actuator>();
        ArrayList<String> roomList = new ArrayList<String>();
    }


    public void addActuator(double value, String room){
        Actuator actuator = new Actuator(value , room );
        actuatorList.add(actuator);

    }

    public void removeActuator(String room){
        for (Actuator actuator : actuatorList){
            if (room == actuator.getName()) {
                actuatorList.remove(actuator);
            }
        }
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
        for (Sensor sensor: sensorList){
            if (name== sensor.getName()){
                sensorList.remove(sensor);
            }
        }
    }

    public void removeSensor (UUID id){
        for (Sensor sensor: sensorList){
            if (id == sensor.getId()){
                sensorList.remove(sensor);
            }
        }
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
