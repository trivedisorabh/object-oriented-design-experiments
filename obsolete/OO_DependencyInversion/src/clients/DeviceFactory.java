package clients;

import processes.GeneralManufacturingProcess;
import processes.SmartPhoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String args[]) {
        GeneralManufacturingProcess manufacturer = new SmartPhoneManufacturingProcess("Iphone");
        manufacturer.launchProcess();
    }

}
