package design_patterns.CarRentalSystem;

import design_patterns.CarRentalSystem.vehicle.Car;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String govtId;
    private Location location;
    private List<Car> cars;

    public User(int id, String name, String govtId) {
        this.id = id;
        this.name = name;
        this.govtId = govtId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGovtId() {
        return govtId;
    }

    public void setGovtId(String govtId) {
        this.govtId = govtId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
