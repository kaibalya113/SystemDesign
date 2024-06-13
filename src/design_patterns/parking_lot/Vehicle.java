package design_patterns.parking_lot;
import java.util.Date;

public abstract class Vehicle {
    protected String vehicleNo;
    protected String vehicleId;
    protected String vehicleType;

    public Ticket getTicket(Vehicle vehicle){
        Ticket ticket = new Ticket();
        if(vehicle.vehicleType.equalsIgnoreCase("CAR")){
            ticket.setEntryTime(new Date());
            ticket.setPrice("40");
        }
        if(vehicle.vehicleType.equalsIgnoreCase("BIKE")){
            ticket.setEntryTime(new Date());
            ticket.setPrice("20");
        }
        return ticket;
    }

}
