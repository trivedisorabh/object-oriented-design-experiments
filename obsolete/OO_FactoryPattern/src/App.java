
public class App {

   public static void main(String args[]){
       Vehicle v = VehicleFactory.getVehicle(VehicleType.TRUCK);
       v.startEngine();
   }
    
    
}
