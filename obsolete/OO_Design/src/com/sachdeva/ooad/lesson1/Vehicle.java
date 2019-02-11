package com.sachdeva.ooad.lesson1;

public class Vehicle {

    // Composition association, it implies ownership. That means the vehicle owns an engine.
    private Engine myEngine;

    public Vehicle(Engine anEngine) {
        this.myEngine = anEngine;
    }

    public void operateVehicle() {
        myEngine.startEngine();
    }
}
