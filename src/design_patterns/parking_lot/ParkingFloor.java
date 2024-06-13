package design_patterns.parking_lot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class ParkingFloor {
    // parking fllor will have list of parking spot
    List<ParkingSpot> parkingSpotsList = new ArrayList<>();
    private String floorNo;
    private int ParkingCountForCars;
    private int ParkingCountForBikes;
    private int availableParkingSpotsForCar;
    private int availableParkingSpotsForBike;

    // every parking will have only 20 parking spot 10 for car and 10 bikes


    public ParkingFloor( String floorNo, int parkingCountForCars, int parkingCountForBikes, int availableParkingSpotsForCar, int availableParkingSpotsForBike) {
        this.floorNo = floorNo;
        this.ParkingCountForCars = parkingCountForCars;
        this.ParkingCountForBikes = parkingCountForBikes;
        this.availableParkingSpotsForCar = availableParkingSpotsForCar;
        this.availableParkingSpotsForBike = availableParkingSpotsForBike;

        for(int i=1; i<=parkingCountForCars; i++){
            ParkingSpot parkingSpot = new ParkingSpot("NULL", "F"+i, floorNo, true);
            this.parkingSpotsList.add(parkingSpot);
        }
        for(int i=1; i<=parkingCountForBikes; i++){
            ParkingSpot parkingSpot = new ParkingSpot("NULL", "B"+i, floorNo, true);
            this.parkingSpotsList.add(parkingSpot);
        }
    }
    // this will add parking spot for a particular floor
    public ParkingFloor addParkingSpot(String floorNo, int ParkingCountForCars, int ParkingCountForBikes, int availableParkingSpotsForCar, int availableParkingSpotsForBike){
        ParkingFloor parkingFloor = new ParkingFloor(floorNo, ParkingCountForCars, ParkingCountForBikes, availableParkingSpotsForCar, availableParkingSpotsForBike);
        return parkingFloor;
    }
    public String getAvailableSpots(){
        return "Available Parking spots For Car:"+this.availableParkingSpotsForCar
                +" Bike : "+ this.availableParkingSpotsForBike;
    }

    public boolean assignVehicle(Vehicle vehicle, List<ParkingFloor> parkingFloors) throws InterruptedException {

        if(vehicle.vehicleType.equalsIgnoreCase("CAR")){
            if(this.availableParkingSpotsForCar >= 1){
                List<ParkingSpot> parkingSpot = this.parkingSpotsList.stream().filter(ps -> ps.isAvailble).collect(Collectors.toList());
                ParkingSpot ps = parkingSpot.get(ThreadLocalRandom.current().nextInt(0, parkingSpot.size() - 1));
                ps.setVehicleNo(vehicle.vehicleNo);
                ps.setAvailble(false);
                ps.setParkingSlotNo(ps.getParkingFloor());
                ps.setParkingSlotNo(ps.getParkingSlotNo());
                this.availableParkingSpotsForCar -= 1;
                return true;
            }
            else {
            // check if 2nd floor is available or not then
            //("F0", 1, 1, 2);
            System.out.println("Current parking is full, assigning to next Floor...");
            Thread.sleep(40);
            parkingFloors.add(addParkingSpot("F"+1, 1, 1,1,1));
            List<ParkingSpot> parkingSpot = this.parkingSpotsList.stream().filter(ps -> ps.isAvailble).collect(Collectors.toList());
                for (ParkingFloor pf: parkingFloors) {

                }
            ParkingSpot ps = parkingSpot.get(ThreadLocalRandom.current().nextInt(0, parkingSpot.size() - 1));
            ps.setVehicleNo(vehicle.vehicleNo);
            ps.setAvailble(false);
            ps.setParkingSlotNo(ps.getParkingFloor());
            ps.setParkingSlotNo(ps.getParkingSlotNo());
            this.availableParkingSpotsForCar -= 1;

            return true;

        }
        }else if(vehicle.vehicleType.equalsIgnoreCase("BIKE")){
            if(this.availableParkingSpotsForCar >= 1){
                addBike(vehicle);
                return true;}
        }
        return false;
    }

    void existVehicle(Vehicle vehicle){
        Optional<ParkingSpot> parkingSpot = this.parkingSpotsList.stream().filter(parkingSpot1 -> parkingSpot1.getVehicleNo().equalsIgnoreCase(vehicle.vehicleNo)).findFirst();
        if(parkingSpot.isPresent())
            parkingSpot.get().setVehicleNo("NULL");
            parkingSpot.get().setAvailble(true);
            if(vehicle.vehicleType.equalsIgnoreCase("CAR"))
                this.availableParkingSpotsForCar+=1;
            else
                this.availableParkingSpotsForBike+=1;

    }

    public void addCar(Vehicle vehicle) {
        if (this.availableParkingSpotsForCar >= 1) {
            List<ParkingSpot> parkingSpot = this.parkingSpotsList.stream().filter(ps -> ps.isAvailble).collect(Collectors.toList());
            ParkingSpot ps = parkingSpot.get(ThreadLocalRandom.current().nextInt(0, parkingSpot.size() - 1));
            ps.setVehicleNo(vehicle.vehicleNo);
            ps.setAvailble(false);
            ps.setParkingSlotNo(ps.getParkingFloor());
            ps.setParkingSlotNo(ps.getParkingSlotNo());
            this.availableParkingSpotsForCar -= 1;
        }
    }
    public void addBike(Vehicle vehicle) {
        if (this.availableParkingSpotsForCar >= 1) {
            List<ParkingSpot> parkingSpot = this.parkingSpotsList.stream().filter(ps -> ps.isAvailble).collect(Collectors.toList());
            ParkingSpot ps = parkingSpot.get(ThreadLocalRandom.current().nextInt(0, parkingSpot.size() - 1));
            ps.setVehicleNo(vehicle.vehicleNo);
            ps.setAvailble(false);
            ps.setParkingSlotNo(ps.getParkingFloor());
            ps.setParkingSlotNo(ps.getParkingSlotNo());
            this.availableParkingSpotsForBike -= 1;
        }
    }
}
