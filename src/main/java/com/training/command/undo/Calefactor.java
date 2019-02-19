package com.training.command.undo;

// Clase que va a modelar un calefactor con distintas velocidades
public class Calefactor {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public Calefactor(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + ": calefactor esta alto");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + ": calefactor esta medio");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + ": calefactor esta bajo");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + ": calefactor esta off");
    }

    public int getSpeed() {
        return speed;
    }
}
