package design_patterns.abstract_Factory;

import design_patterns.factory.Bus;
import design_patterns.factory.Car;
import design_patterns.factory.VehicleNames;

public class Get4WheelVehicle implements FactoryClass{

    @Override
    public Vehicle getVehicle(String name) {
        if(name.equalsIgnoreCase(String.valueOf(design_patterns.factory.VehicleNames.CAR))){
            return (Vehicle) new Car();
        }
        if(name.equalsIgnoreCase(String.valueOf(VehicleNames.BUS))){
            return (Vehicle) new Bus();
        }
        return null;
    }
}
