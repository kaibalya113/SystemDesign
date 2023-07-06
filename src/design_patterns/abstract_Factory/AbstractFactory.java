package design_patterns.abstract_Factory;

public class AbstractFactory {
    public static void main(String[] args){
        Abstract anAbstract = new Abstract();
        Vehicle vehicle = anAbstract.get("CAR");
        vehicle.speed();
    }
}
