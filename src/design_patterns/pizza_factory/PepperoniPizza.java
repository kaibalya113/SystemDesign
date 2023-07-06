package design_patterns.pizza_factory;

public class PepperoniPizza implements Pizza{
    @Override
    public void createPizza() {
        System.out.println("PepperoniPizza Created");
    }


    public void cut() {
        System.out.println("Pizza is Cutting spped");
    }
}
