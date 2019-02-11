package com.sachdeva.ooad.lesson4;

public class Doctor extends Employee {

    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action ....");
    }

}
