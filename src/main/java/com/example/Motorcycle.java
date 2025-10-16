package com.example;

public class Motorcycle implements Driveable {
    boolean  isDriving = false;
    int travelledDistance = 0;
    int gasUsage = 4;
    int usedGas = 0;

    @Override
    public void drive() {
        isDriving = true;
    }

    @Override
    public void stop(int distance) {
        travelledDistance += distance;
        isDriving = false;
        usedGas += gasUsage*distance;
   
    }

    @Override
    public String toString() {
        return "Motorcycle [usedGas=" + usedGas + "]";
    }
    

    
}
