package design_patterns.abstract_Factory;


public class Cycle implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Cycle Speed is 30KM/H");
    }
}
