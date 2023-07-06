package design_patterns.abstract_Factory;


public class Bus implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Bus speed is 80Km/H");
    }
}
