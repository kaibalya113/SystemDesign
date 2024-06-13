package design_patterns.CarRentalSystem.vehicle;

import design_patterns.CarRentalSystem.Location;

import java.util.List;

public interface Vehicle {
    public List<Vehicle> getVehicleListBasedOnLocation(Location location);
}
