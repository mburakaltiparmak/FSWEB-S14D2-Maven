package org.example.model;

import org.example.model.enums.LampType;

import static org.example.model.enums.LampType.NEON;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getStyle() {
        return style;
    }

    public void setStyle(LampType style) {
        this.style = style;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void setGlobalRating(int globRating) {
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on");
    }
    public void turnOff(){
        System.out.println("Lamp is turned off");
    }
    public void chargeBattery(){
        setBattery(true);
        System.out.printf("Battery has been charged");
    }
    public void changeLamb(){
        setStyle(NEON);
        System.out.println("New lamb");
    }
}

