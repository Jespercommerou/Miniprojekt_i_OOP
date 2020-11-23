package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class MainSystem {
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
}
