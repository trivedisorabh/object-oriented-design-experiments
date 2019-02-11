package com.sachdeva.ooad.lesson4;

public class EmergencyRoomProcess {

    public static void main(String args[]) {
        
        HospitalManagementUnbearable director = new HospitalManagementUnbearable();
        Employee peggy = new Nurse (1, "Peggy", "emergency", true);
        director.callUpon(peggy);
        
        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        director.callUpon(suzan);
    }

}
