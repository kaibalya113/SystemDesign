package design_patterns.CarRentalSystem.vehicle;

import design_patterns.CarRentalSystem.Location;

import java.util.List;
import java.util.Random;

public class VehicleFactory {

    public List<Vehicle> getVehicleList(String vehicleType, Location location){
        if(vehicleType.equalsIgnoreCase(VehicleType.CAR.name())){
            return new Car().getVehicleListBasedOnLocation(location);
        }
        return null;
    }
    public static int RandomNo(){
        Random random = new Random();
        return random.nextInt(10);
    }
}
