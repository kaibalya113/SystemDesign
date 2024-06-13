package design_patterns.CarRentalSystem;

import design_patterns.CarRentalSystem.vehicle.Vehicle;

import java.util.List;

public class ShowRoom {
    private int id;
    private String name;
    private Location location;
    private List<Vehicle> cars;

    public ShowRoom(ShowRoomBuilder showRoomBuilder) {
        this.id = id;
        this.name = name;
        this.cars = showRoomBuilder.cars;
        this.location = showRoomBuilder.location;
    }
    public static class ShowRoomBuilder{
        private int id;
        private String name;
        private Location location;
        private List<Vehicle> cars;

        public ShowRoomBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public ShowRoomBuilder setLocation(Location location) {
            this.location = location;
            return this;
        }

        public ShowRoomBuilder setCars(List<Vehicle> cars) {
            this.cars = cars;
            return this;
        }
        public ShowRoom build(){
            return new ShowRoom(this);
        }
    }
}
