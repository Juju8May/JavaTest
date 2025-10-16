package com.example;

public class MyClass {
    public String name;
    private int number;
    boolean isReady;

    public MyClass(String n, int z, boolean r) {
        name = n;
        number = z;
        isReady = r;
    }

    public void greeting() {
        System.out.println("Hello " + name);
    }

    public int getNumberValue() {
        return number;
    }

    public boolean checkReadyFlag() {
        return isReady;
    }
    /*
     * public static void main(String[] args) {
     * MyClass beispiel = new MyClass("Max", 42, true);
     * beispiel.greeting();
     * System.out.println(beispiel.getNumberValue());
     * System.out.println(beispiel.checkReadyFlag());
     * }
     */
}