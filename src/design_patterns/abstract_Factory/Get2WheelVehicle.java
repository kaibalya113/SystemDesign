package design_patterns.abstract_Factory;

import design_patterns.factory.Bike;
import design_patterns.factory.Bus;
import design_patterns.factory.Car;
import design_patterns.factory.VehicleNames;

public class Get2WheelVehicle implements FactoryClass{
    @Override
    public Vehicle getVehicle(String name) {

        if(name.equalsIgnoreCase(String.valueOf(design_patterns.factory.VehicleNames.BIKE))){
            return (Vehicle) new Bike();
        }

        return null;
    }
}
