package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public class MainSystem implements IBuildingManagementSystem {
    public ArrayList<Building> buildingList;

    MainSystem(){
        buildingList = new ArrayList<Building>();
    }
    public void addBuilding(String name){
        Building building = new Building(name);
        buildingList.add(building);
    }

    public void removeBuilding(UUID id){
        buildingList.removeIf(building -> building.getId() == id);
    }

    public void removeBuilding(String name){
        buildingList.removeIf(building -> building.getName() == name);
    }

    public void showBuildings(){
        for(Building building : buildingList){
            System.out.println("Building name: " + building.getName() + "\nBuilding ID: " + building.getId());
        }
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        Map<UUID, String> temp = null;
        for(Building building: buildingList){
            temp.put(building.getId(), building.getName());
        }
        return temp;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        Map<UUID, String> temp = null;
        for(Building building: buildingList){
            for(Sensor sensor: building.sensorList){
                temp.put(sensor.getId(), sensor.getName());
            }
        }
        return temp;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Map<UUID, String> temp = null;
        for(Building building: buildingList){
            for(Actuator sensor: building.actuatorList){
                temp.put(sensor.getId(), sensor.getName());
            }
        }
        return temp;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        return null;
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        return null;
    }

    public UUID addTemperatureSensor(UUID buildingId, String name, String room) {
        for (Building building: buildingList){
            if(buildingId==building.getId()) {
                building.addTempSensor(room, name);
                return null;
            }
        }
        return null;
    }

    public UUID addCo2Sensor(UUID buildingId, String name, String room) {
        for (Building building: buildingList){
            if(buildingId==building.getId()) {
                building.addCO2Sensor(room, name);
                return null;
            }
        }
        return null;
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        for (Building building: buildingList){
            if(buildingId==building.getId()) {
                building.removeSensor(sensorId);
            }
        }
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        return null;
    }

    public UUID addVentilationActuator(UUID buildingId, String name, double value) {
        for (Building building: buildingList){
            if(buildingId==building.getId()) {
                building.addActuator(value, name);
                return null;
            }
        }
        return null;
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        for (Building building: buildingList){
            if(buildingId==building.getId()) {
                building.removeActuator(actuatorId);
            }
        }
    }
}
