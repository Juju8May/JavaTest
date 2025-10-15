package com.example;

public class BuildingHouse extends Object {
    static int tenant = 1;
    int price = 500;

    public BuildingHouse(int price) {
        this.price = price;
    }

    public String toString() {
        return "Bewohneranzahl: " + tenant + "Preis des Hauses: " + price;
    }

}