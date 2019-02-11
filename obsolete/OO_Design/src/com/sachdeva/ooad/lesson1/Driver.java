package com.sachdeva.ooad.lesson1;

public class Driver {

    // Here driver depends on vehicle object - this is referred to as
    // "Association"
    // This is dependency association.
    public void drive(Vehicle raceCar) {
        raceCar.operateVehicle();
    }
}
