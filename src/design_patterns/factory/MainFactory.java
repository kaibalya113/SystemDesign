package design_patterns.factory;

public class MainFactory {
    public static void main(String[] args){
        FactoryClass factoryClass = new FactoryClass();
        Vehicle vehicle = factoryClass.getSpeed("BIKE");
        vehicle.speed();
    }
}
