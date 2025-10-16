package com.example;

public class Fahrrad implements Beweglich {
    int geschwindigkeit = 0;
    boolean bewegt = false;

    public void bewegen(){
        bewegt = true;
    }
    public void starten (){
        geschwindigkeit += 15; 
    }
    @Override
    public String toString() {
        return "Fahrrad [geschwindigkeit=" + geschwindigkeit + ", bewegt=" + bewegt + "]";
    }
}
