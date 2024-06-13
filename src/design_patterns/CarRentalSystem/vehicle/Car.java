package design_patterns.CarRentalSystem.vehicle;

import design_patterns.CarRentalSystem.Location;
import design_patterns.CarRentalSystem.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static design_patterns.CarRentalSystem.vehicle.VehicleFactory.RandomNo;

public class Car implements Vehicle {
    private int id;
    private String carName;
    private String carBrand;
    private String carColor;
    private String noPlate;
    private String kmDriven;
    private LocalDateTime carInTime;
    private LocalDateTime carOutTime;
    private CarStatus carStatus;
    private Double price;
    private Location location;
    private User user;

    public Car(int id, String carName, String carBrand, String carColor, String noPlate, String kmDriven, LocalDateTime carInTime, LocalDateTime carOutTime, CarStatus carStatus, Double price) {
        this.id = id;
        this.carName = carName;
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.noPlate = noPlate;
        this.kmDriven = kmDriven;
        this.carInTime = carInTime;
        this.carOutTime = carOutTime;
        this.carStatus = carStatus;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getNoPlate() {
        return noPlate;
    }

    public void setNoPlate(String noPlate) {
        this.noPlate = noPlate;
    }

    public String getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(String kmDriven) {
        this.kmDriven = kmDriven;
    }

    public LocalDateTime getCarInTime() {
        return carInTime;
    }

    public void setCarInTime(LocalDateTime carInTime) {
        this.carInTime = carInTime;
    }

    public LocalDateTime getCarOutTime() {
        return carOutTime;
    }

    public void setCarOutTime(LocalDateTime carOutTime) {
        this.carOutTime = carOutTime;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car() {
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public List<Vehicle> getVehicleListBasedOnLocation(Location location) {
        List<Car> carsList = new ArrayList<>();
        Car car = new Car(RandomNo(), "TIAGO", "TATA", "BLACK", "MH14KH1883", "50000KM", null, null, CarStatus.AVAILABLE,3000.00);
        car.setLocation(new Location("Fursungi", "Pune", "Maharastra"));
        Car car1 = new Car(RandomNo(), "POLO GT", "VW", "RED", "MH14KH1883", "50000KM", null, null, CarStatus.AVAILABLE,3000.00);
        car1.setLocation(new Location("Fursungi", "Pune", "Maharastra"));
        Car car2 = new Car(RandomNo(), "VENTO", "VW", "BLACK", "MH14KH1883", "50000KM", null, null, CarStatus.AVAILABLE,3000.00);
        car2.setLocation(new Location("Fursungi", "Pune", "Maharastra"));
        Car car3 = new Car(RandomNo(), "SUJUKI", "MARUTI", "PINK", "MH14KH1883", "50000KM", null, null, CarStatus.AVAILABLE,3000.00);
        car3.setLocation(new Location("Fursungi", "Pune", "Maharastra"));
        Car car4 = new Car(RandomNo(), "THAR", "MAHINDRA", "BROWN", "MH14KH1883", "50000KM", null, null, CarStatus.AVAILABLE,3000.00);
        car4.setLocation(new Location("Fursungi", "Pune", "Maharastra"));
        Car car5 = new Car(RandomNo(), "POLO", "VW", "SKY", "MH14KH1883", "50000KM", null, null, CarStatus.AVAILABLE,3000.00);
        car5.setLocation(new Location("HADAPSAR", "Pune", "Maharastra"));
        carsList = Arrays.asList(car, car1, car2, car3, car4, car5);

        return carsList.stream().filter(cars -> cars.getLocation().getCity().equalsIgnoreCase(location.getCity())).collect(Collectors.toList());
    }
}
