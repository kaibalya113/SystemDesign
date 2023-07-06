package design_patterns.factory;

public class Bike implements Vehicle{
    @Override
    public void speed() {
        System.out.println("Bike speed is 129KM/H");
    }
}
