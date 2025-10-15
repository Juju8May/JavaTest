package com.example;

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
        System.out.println("Hello World");
        BuildingHouse eins = new BuildingHouse(1000);
        BuildingHouse zwei = new BuildingHouse(3000);
        System.out.println(eins);
        System.out.println(zwei);
        BuildingHouse.tenant = 4;
        System.out.println(eins);
        System.out.println(zwei);
        
    }
    
    /**
     * Method to get the greeting message.
     * This is useful for testing purposes.
     * 
     * @return the greeting message
     */
    public String getGreeting() {
        return "Hello World";
    }
}
