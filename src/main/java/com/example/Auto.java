package com.example;

public class Auto extends Fahrzeug implements Beweglich {

    int geschwindigkeit = 0;
    boolean bewegt = false;

    public Auto(int geschwindigkeit, boolean bewegt) {
        this.geschwindigkeit = geschwindigkeit;
        this.bewegt = bewegt;
    }

    public void bewegen() {
        bewegt = true;
    }

    public void starten() {
        geschwindigkeit += 100;
        bewegen();
    }

    @Override
    public String toString() {
        return "Auto [geschwindigkeit=" + geschwindigkeit + ", bewegt=" + bewegt + "]";
    }

}
