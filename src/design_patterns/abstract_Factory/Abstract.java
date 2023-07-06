package design_patterns.abstract_Factory;

import design_patterns.factory.Bike;
import design_patterns.factory.Car;
import design_patterns.factory.VehicleNames;

public class Abstract {

    // get 2 wheeler and 4 wheeler vehicle
    public Vehicle get(String name){
        if(name.equalsIgnoreCase(String.valueOf(design_patterns.factory.VehicleNames.CAR))){
            return new Get4WheelVehicle().getVehicle(name);
        }
        if(name.equalsIgnoreCase(String.valueOf(VehicleNames.BIKE))){
            return new Get2WheelVehicle().getVehicle(name);
        }
        return null;
    }
}
