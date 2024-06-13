package design_patterns.parking_lot;

import design_patterns.factory.Bike;

public class Bikee extends Vehicle{

    public Bikee(String vehicleNo) {
        super.vehicleNo = vehicleNo;
    }

    @Override
    public Ticket getTicket(Vehicle vehicle) {
        vehicle.vehicleType = "BIKE";
        vehicle.vehicleId = String.valueOf(Math.random());
        vehicle.vehicleNo = super.vehicleNo;
        return super.getTicket(vehicle);
    }
}
