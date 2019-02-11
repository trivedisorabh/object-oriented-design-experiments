package com.sachdeva.ooad.lesson1;

public class App {

    public static void main(String args[]) {
        Engine myEngine = new Engine();
        Vehicle myCar = new Vehicle(myEngine);
        myCar.operateVehicle();
    }

}
