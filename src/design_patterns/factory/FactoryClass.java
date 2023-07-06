package design_patterns.factory;

public class FactoryClass {

    public Vehicle getSpeed(String name){
        if(name.equalsIgnoreCase(String.valueOf(VehicleNames.CAR))){
            return new Car();
        }
        if(name.equalsIgnoreCase(String.valueOf(VehicleNames.BIKE))){
            return new Bike();
        }
        if(name.equalsIgnoreCase(String.valueOf(VehicleNames.BUS))){
            return new Bus();
        }
        return null;
    }
}
