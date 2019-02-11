package com.sachdeva.ooad.lesson4Improved;

public class EmergencyRoomProcess {

    public static void main(String args[]) {
        
        HospitalManagement director = new HospitalManagement();
        Employee peggy = new Nurse (1, "Peggy", "emergency", true);
        director.callUpon(peggy);
        
        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        director.callUpon(suzan);
    }

}
