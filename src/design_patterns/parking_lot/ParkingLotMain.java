package design_patterns.parking_lot;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ParkingLotMain {
    public static void main(String[] args) throws InterruptedException {
        Admin admin = new Admin();
        List<ParkingFloor> parkingFloor = admin.addFloor();
        System.out.println(parkingFloor.stream().map(f -> f.parkingSpotsList).collect(Collectors.toList()));

        // car is enter to parkingfloor in entrance
        Vehicle vehicle = new Car("MH01BK4532");
        Ticket ticket = vehicle.getTicket(vehicle);
        System.out.println(ticket.getEntryTime()+": "+ ticket.getPrice());
        System.out.println("Available Parking spots For Car:"+parkingFloor.stream().findFirst().get().getAvailableSpots());

        // assign vehicle to parking floor and parking spot
        boolean isParked = parkingFloor.stream().findFirst().get().assignVehicle(vehicle, parkingFloor);
        if(isParked){
            System.out.println("Vehicle No : "+ vehicle.vehicleNo +"is parked.");
        }else{
            System.out.println("Parking is full");
        }
        System.out.println(parkingFloor.get(0).parkingSpotsList.toString());
        System.out.println("Available Parking spots For Car:"+parkingFloor.get(0).getAvailableSpots());



        // car is enter to parkingfloor in entrance
        Vehicle vehicle1 = new Car("MH01BK4533");
        Ticket ticket1 = vehicle1.getTicket(vehicle1);
        System.out.println(ticket1.getEntryTime()+": "+ ticket1.getPrice());
        System.out.println("Available Parking spots For Car:"+parkingFloor.get(0).getAvailableSpots());

        // assign vehicle to parking floor and parking spot
        boolean isParked1 = parkingFloor.get(0).assignVehicle(vehicle1, parkingFloor);
        if(isParked1){
            System.out.println("Vehicle No : "+ vehicle1.vehicleNo +"is parked.");
        }else{
            System.out.println("Parking is full");
        }
        System.out.println(parkingFloor.get(0).parkingSpotsList.toString());
        System.out.println("Available Parking spots For Car:"+parkingFloor.get(0).getAvailableSpots());

        System.out.println(parkingFloor.get(0).parkingSpotsList.toString());

        // exist vehicle
//        parkingFloor.existVehicle(vehicle);
//        System.out.println("Please Make Payment before left");
//        // asking vehicle to make payment
//        new Payment().makePayment(ticket.getPrice(), vehicle.vehicleNo);
//
//        System.out.println(vehicle.vehicleNo +" is now left.");
//        System.out.println(parkingFloor.parkingSpotsList.toString());
//        System.out.println("Available Parking spots For Car:"+parkingFloor.getAvailableSpots());
    }


}
