package design_patterns.abstract_Factory;


public class Bike implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Bike speed is 129KM/H");
    }
}
