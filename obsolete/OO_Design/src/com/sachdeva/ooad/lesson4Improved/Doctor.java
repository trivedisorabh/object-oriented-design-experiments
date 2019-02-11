package com.sachdeva.ooad.lesson4Improved;

public class Doctor extends Employee {

    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action ....");
    }

    @Override
    public void performDuties() {
        diagnosePatient();
        prescribeMedicines();
    }

    // Doctor
    private void prescribeMedicines() {
        System.out.println("Prescribe medicines");
    }

    private void diagnosePatient() {
        System.out.println("Diagnose patient");
    }
}
