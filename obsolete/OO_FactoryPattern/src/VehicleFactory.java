public class VehicleFactory {

    private VehicleFactory() {
    }

    public static Vehicle getVehicle(VehicleType vehicleType) {
        return vehicleType.getVehicle();
    }

}
