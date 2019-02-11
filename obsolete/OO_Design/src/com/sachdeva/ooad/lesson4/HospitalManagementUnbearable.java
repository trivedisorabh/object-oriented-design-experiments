package com.sachdeva.ooad.lesson4;

public class HospitalManagementUnbearable {

    public void callUpon(Employee employee) {

        
        if (employee instanceof Nurse) {
            checkVitalSigns();
            drawBlood();
            cleanPatientArea();
        }
        else if (employee instanceof Doctor) {
            diagnosePatient();
            prescribeMedicines();
        }
    }

    // Nurses
    private void checkVitalSigns() {
        System.out.println("Checking vitals");
    }

    private void drawBlood() {
        System.out.println("Drawing blood");
    }

    private void cleanPatientArea() {
        System.out.println("Cleaning patient area");
    }

    // Doctor
    private void prescribeMedicines() {
        System.out.println("Prescribe medicines");
    }

    private void diagnosePatient() {
        System.out.println("Diagnose patient");
    }
}
