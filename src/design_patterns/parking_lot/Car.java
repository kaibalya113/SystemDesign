package design_patterns.parking_lot;

public class Car extends Vehicle{

    public Car(String vehicleNo) {
        super.vehicleNo = vehicleNo;
    }

    @Override
    public Ticket getTicket(Vehicle vehicle) {
        vehicle.vehicleType = "CAR";
        vehicle.vehicleId = String.valueOf(Math.random());
        vehicle.vehicleNo = super.vehicleNo;
        return super.getTicket(vehicle);
    }


}
