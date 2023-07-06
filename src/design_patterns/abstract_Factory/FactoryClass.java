package design_patterns.abstract_Factory;

import design_patterns.factory.VehicleNames;

public interface FactoryClass {

    Vehicle getVehicle(String name);
}
