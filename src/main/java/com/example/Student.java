package com.example;

public class Student {
    public static int anzahlStudenten = 0;
    public String name;
    public int matrikelnummer;

    public Student(String n, int r) {
        name = n;
        matrikelnummer = r;
        anzahlStudenten += 1;
    }

    public String toString() {
        return name + " " + matrikelnummer;
    }
}
