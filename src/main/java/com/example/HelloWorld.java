package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * A simple Hello World application.
 */
public class HelloWorld {

    /**
     * Main method that prints "Hello World" to the console.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        /*
         * System.out.println("Hello World");
         * BuildingHouse eins = new BuildingHouse(1000);
         * BuildingHouse zwei = new BuildingHouse(3000);
         * System.out.println(eins);
         * System.out.println(zwei);
         * BuildingHouse.tenant = 4;
         * System.out.println(eins);
         * System.out.println(zwei);
         */

        int zahl = 0;
        Integer zahl2 = 3;

        boolean richtig = false;
        Boolean falsch = false;

        Car audi = new Car();
        Car audi2 = audi;
        audi2.drive();
        audi2.stop(5);
        System.out.println(audi);
        System.out.println(audi2);

        Motorcycle m = new Motorcycle();

        List<Driveable> liste = new ArrayList<>();
        liste.add(m);
        liste.add(audi);

        for (Driveable d : liste) {
            d.drive();
        }
        for (Driveable d : liste) {
            d.stop(10);
        }
        /*
         * for (Driveable d : liste) {
         * System.out.println(d);
         * }
         */

        /*
         * for (int i = 0; i < liste.size(); i++) {
         * Driveable d = liste.get(i);
         * d.drive();
         * }
         */

        /*
         * Driveable[] vehicles = new Driveable[2];
         * vehicles[0] = audi;
         * vehicles[1] = m;
         * 
         * for (int i = 0; i < vehicles.length; i++) {
         * Driveable d = vehicles[i];
         * d.drive();
         * }
         * 
         * for (int i = 0; i < vehicles.length; i++) {
         * Driveable d = vehicles[i];
         * d.stop(10);
         * }
         * for (int i = 0; i < vehicles.length; i++) {
         * Driveable d = vehicles[i];
         * System.out.println(d);
         * }
         */
        /*
         * //Test für private/protected usw.
         * Person julia = new Person();
         * julia.age = 29;
         * julia.name = "Julia";
         * System.out.println(julia.name);
         * System.out.println(julia.age);
         */

        MyClass beispiel = new MyClass("Max", 42, true);
        beispiel.greeting();
        System.out.println(beispiel.getNumberValue());
        System.out.println(beispiel.checkReadyFlag());

        Student klaus = new Student("Klaus Kinski ", 65);
        Student lisa = new Student("Lisa Meier ", 19);
        System.out.println("Anzahl an Studenten: " + Student.anzahlStudenten);
        System.out.println(klaus);
        System.out.println(lisa);
        System.out.println(getGreeting());
 
        Auto mitsubishi = new Auto(50, false);
        mitsubishi.starten();
        System.out.println(mitsubishi);
        Motorrad kawasaki = new Motorrad(0);
        kawasaki.starten();
        System.out.println(kawasaki);
    }

    /**
     * Method to get the greeting message.
     * This is useful for testing purposes.
     * 
     * @return the greeting message
     */
    public static String getGreeting() {
        return "Hello World";
    }
}
