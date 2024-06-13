package design_patterns.parking_lot;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Person{
    public List<ParkingFloor> addFloor(){
        List<ParkingFloor> parkingFloor = new ArrayList<>();
        parkingFloor.add(new ParkingFloor("F0", 1, 1,1,1));
        //parkingFloor.add(new ParkingFloor("F1", 1, 1,1,1));
        return parkingFloor;
    }
}
