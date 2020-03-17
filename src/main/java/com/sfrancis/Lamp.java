package com.sfrancis;

class Lamp {

    // instance variable
    private boolean isOn;

    // method
    public void turnOn() {
        isOn = true;
    }

    public static String getStatus(){
        return "Positive";
    }

    // method
    public void turnOff() {
        isOn = false;
    }
}
