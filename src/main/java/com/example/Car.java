package com.example;

public class Car implements Driveable{
    boolean  isDriving = false;
    int travelledDistance = 0;
    int gasUsage = 10;
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
        return "Car [isDriving=" + isDriving + ", travelledDistance=" + travelledDistance + ", gasUsage=" + gasUsage
                + ", usedGas=" + usedGas + "]";
    }



}
