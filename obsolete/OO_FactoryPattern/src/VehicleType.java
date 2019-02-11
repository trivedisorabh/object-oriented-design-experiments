
public enum VehicleType {

    CAR{
        @Override
        public Vehicle getVehicle() {
            return new Car();
        }  
    },
    
    TRUCK{
        @Override
        public Vehicle getVehicle() {
            return new Truck();
        }  
    };
    
    public abstract Vehicle getVehicle();
    
}
