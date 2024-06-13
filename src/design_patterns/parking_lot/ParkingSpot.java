package design_patterns.parking_lot;

public class ParkingSpot {
    // parking spot is available for only 1 vehicle
    private static ParkingSpot parkingSpot;
    private String vehicleNo;
    private String parkingSlotNo;
    private String parkingFloor;
    protected boolean isAvailble;

    public ParkingSpot(String vehicleNo, String parkingFloor, String parkingSlotNo, boolean isAvailble){
        this.parkingFloor = parkingFloor;
        this.parkingSlotNo = parkingSlotNo;
        this.vehicleNo = vehicleNo;
        this.isAvailble = isAvailble;
    }
//    public static ParkingSpot getParkingSpot(String vehicleNo, ParkingFloor parkingFloor, String parkingSlotNo, boolean isAvailble){
//        if(parkingSpot == null){
//            parkingSpot =  new ParkingSpot(vehicleNo, parkingFloor, parkingSlotNo, isAvailble);
//        }
//        return parkingSpot;
//    }
    public ParkingSpot(){
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", parkingSlotNo='" + parkingSlotNo + '\'' +
                ", parkingFloor='" + parkingFloor + '\'' +
                ", isAvailble=" + isAvailble +
                '}';
    }

    public static ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getParkingSlotNo() {
        return parkingSlotNo;
    }

    public String getParkingFloor() {
        return parkingFloor;
    }

    public boolean isAvailble() {
        return isAvailble;
    }

    public static void setParkingSpot(ParkingSpot parkingSpot) {
        ParkingSpot.parkingSpot = parkingSpot;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public void setParkingSlotNo(String parkingSlotNo) {
        this.parkingSlotNo = parkingSlotNo;
    }

    public void setParkingFloor(String parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public void setAvailble(boolean availble) {
        isAvailble = availble;
    }
}
