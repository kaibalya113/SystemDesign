package design_patterns.abstract_Factory;


public class Car implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Car speed is : 240 KM/H");
    }
}
