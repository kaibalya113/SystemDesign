package design_patterns.CarRentalSystem;

import design_patterns.CarRentalSystem.payment.Payment;
import design_patterns.CarRentalSystem.payment.PaymentFactory;
import design_patterns.CarRentalSystem.payment.PaymentType;
import design_patterns.CarRentalSystem.vehicle.Car;
import design_patterns.CarRentalSystem.vehicle.CarStatus;
import design_patterns.CarRentalSystem.vehicle.Vehicle;
import design_patterns.CarRentalSystem.vehicle.VehicleFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarRental {
    public static void main(String[] args){
        // 1: create a user and car

        User user1 = new User(1, "krishna", "CUIPM6667L");
        user1.setLocation(new Location("Fursungi", "Pune", "Maharastra"));
        user1.setCars(null);

        //2: if customer select Car then list of cars will display based on his/her location
        // used factory design pattern
        VehicleFactory vehicleFactory = new VehicleFactory();
        // ISSUE: is this approach correct or not
        List<Vehicle> vehicleList = vehicleFactory.getVehicleList("CAR", user1.getLocation());

//        List<Object> allVehicles1 = new ArrayList<Object>();
//        allVehicles1.add(vehicleList);
//        allVehicles1.stream().forEach(car -> {
//            System.out.println(car[0].);
//        });
        // 3: we assume customer select 2nd car
        Car car = (Car)vehicleList.get(2);

        // 4: here he will checks whether car is available or not. if avavailble the it display
        // the price else it will say not available
        if(car!=null && car.getCarStatus().name().equals(CarStatus.AVAILABLE.name())){
            System.out.println(car.getCarName()+" per day price is :"+car.getPrice());

            // now customer decide to rent this car.
            // then he will click on date range
            int noOfDayToRent = 3;
            car.setCarOutTime(LocalDateTime.now());
            car.setCarInTime(LocalDateTime.now().plusDays(noOfDayToRent));
            Double amount = car.getPrice()*noOfDayToRent;

            // after selecting the date range he will click on book
            car.setCarStatus(CarStatus.RENTED);
            // now he will go to ShowRoom to Collect the selected car
            ShowRoom showRoom = new ShowRoom.ShowRoomBuilder(1, "Jay Shiv").setCars(vehicleList).setLocation(user1.getLocation()).build();
            //System.out.println(showRoom);
            // CUSTOMER GIVE PAYMENT AND TAKE THE CAR
            // AND CHECK THE GOVT ID OF THE CUSTOMER
            PaymentFactory paymentFactory = new PaymentFactory();
            Payment payment = paymentFactory.makePayment(PaymentType.CREDIT, amount);
            if(payment.makePayment()){
                System.out.println("Car is successfully Ranted out");
            }

            // AFTER 3 DAYS THAT CUSTMER RETURNT THE CAR

        }else{
            System.out.println(car.getCarName()+" is not available plese select available cars");
        }




    }
}
