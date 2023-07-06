package design_patterns.factory;

public class Bus implements Vehicle{
    @Override
    public void speed() {
        System.out.println("Bus speed is 80Km/H");
    }
}
