package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class MainSystem {
    private ArrayList<Building> buildingList;

    MainSystem(){
        buildingList = new ArrayList<Building>();
    }
    public void addBuilding(String name){
        Building building = new Building(name);
        buildingList.add(building);
    }

    public void removeBuilding(UUID id){
        for(Building building : buildingList){
            if(building.getId()==id){
                buildingList.remove(building);
            }
        }
    }

    public void removeBuilding(String name){
        for(Building building : buildingList){
            if(building.getName()==name){
                buildingList.remove(building);
            }
        }
    }

    public void showBuildings(){
        for(Building building : buildingList){
            System.out.println("Building name: " + building.getName() + "\nBuilding ID: " + building.getId());
        }
    }
}
