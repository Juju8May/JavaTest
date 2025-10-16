package com.example;

public class Motorrad extends Fahrzeug {
    int geschwindigkeit = 0;

    public Motorrad(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    void starten() {
        geschwindigkeit += 50;
    }

    @Override
    public String toString() {
        return "Motorrad [geschwindigkeit=" + geschwindigkeit + "]";
    }

}
